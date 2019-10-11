package com.ouyeel.util;

import com.google.common.collect.Lists;
import com.ouyeel.mybatissql.MybatissqlApplication;
import com.ouyeel.pojo.FileHistory;
import com.ouyeel.pojo.SqlTable;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.apache.poi.util.IOUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.logging.Logger;

public class SqlSource {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://10.60.145.94:3306/xservices_deploy?useUnicode=true&characterEncoding=utf8";
    static final String USER = "root";
    static final String PASS = "root";


    private  static String urlBig="";
    public static List<SqlTable> getSqlSource(String classesUrl, String projectName,String name){
        List<SqlTable> sqls=new ArrayList<SqlTable>();
        SqlTable sqlTable;
        String key="";
        try {
            URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
            getUnknowFilePath(classesUrl,"/WEB-INF/classes");
            System.out.println("获取的路径urlBig============"+urlBig);
            String url=urlBig.substring(0,urlBig.lastIndexOf("/WEB-INF/classes"));
            File classesFile = new File(url+"/WEB-INF/classes");
            Method add = URLClassLoader.class.getDeclaredMethod("addURL", new Class[]{URL.class});
            add.setAccessible(true);
            add.invoke(classLoader, classesFile.toURI().toURL());
            //项目的lib文件
            File pathLib = new File(url+"/WEB-INF/lib");
            if(pathLib.exists()){
                if(pathLib.listFiles().length>0){
                    for (File file : pathLib.listFiles()) {
                        add.invoke(classLoader, file.toURI().toURL());
                    }
                }
            }
            PathMatchingResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
            Resource[] resourcesMapper = resolver.getResources("file:"+url+"/**/mapp*/*.xml");
            Resource[] resourcesMapperSql = resolver.getResources("file:"+url+"/**/mapp*/*/*.xml");
            Resource[] resourcesSql = resolver.getResources("file:"+url+"/**/*Mapper.xml");
            Resource[] resourcesBig = new Resource[resourcesMapper.length+resourcesMapperSql.length+resourcesSql.length];

            for(int i=0;i<resourcesBig.length;i++ ) {
                if (resourcesMapper.length > 0 && resourcesMapper.length > i) {
                    resourcesBig[i] = resourcesMapper[i];
                }
                if (resourcesMapperSql.length > 0 && resourcesMapper.length <= i
                        &&  resourcesBig.length -resourcesSql.length > i) {
                    resourcesBig[i] = resourcesMapperSql[i - resourcesMapper.length];
                }
                if (resourcesSql.length > 0  &&  resourcesBig.length -resourcesSql.length <= i) {
                    resourcesBig[i] = resourcesSql[i - resourcesMapper.length-resourcesMapperSql.length];
                }
            }
            List<String> pathList = Lists.newArrayList();
            for (int i = 0; i < resourcesBig.length; i++) {
                if (!pathList.contains(resourcesBig[i].getFile().getPath())) {
                    pathList.add(resourcesBig[i].getFile().getPath());
                }
            }

            List<String> xmlFileList=new ArrayList<String>();
            for(int i =0;i<pathList.size();i++){
                //mapper文件的路径
                String xmlPath=pathList.get(i);
                String xmlJson=getSqlByXmlPathFromPython(xmlPath);
                if(xmlJson.length()<1){
                    xmlFileList.add(xmlPath);
                }else{
                    //python获取sql 的json不标准，处理一下
                    xmlJson=xmlJson.replaceAll("\"","'");
                    xmlJson=xmlJson.replaceAll("\\[\\{'","\\[\\{\"");
                    xmlJson=xmlJson.replaceAll(", \\{'",",\\{\"");
                    xmlJson=xmlJson.replaceAll("'\\},","\"},");
                    xmlJson=xmlJson.replaceAll("'\\}]","\"}]");
                    //python3.7
//                    xmlJson=xmlJson.replaceAll("': '","\": \"");
                    //python2.7
                    xmlJson=xmlJson.replaceAll("': u'","\": \"");
                    Map<String, String> map = getMap(xmlJson);
                    Set<String> set=map.keySet();
                    for(String str :set){
                        sqlTable=new SqlTable();
                        sqlTable.setLast_modified_Date(new Date());
                        sqlTable.setName(name);
                        sqlTable.setModule_ename(projectName);
                        sqlTable.setFileName(xmlPath);
                        sqlTable.setFlag('3');
                        String path=xmlPath.substring(xmlPath.lastIndexOf("classes/")+8,xmlPath.length())+"/"+str;
                        sqlTable.setPath(path.replaceAll("/","."));
                        sqlTable.setSql(map.get(str));
                        sqls.add(sqlTable);
                    }
                }
            }
            if(pathList.size()>0){
                System.out.println("/**/mapp*/*.xml有=="+resourcesMapper.length+"个   /**/mapp*/*/*.xml=="+resourcesMapperSql.length+"个  /**/*Mapper.xml=="+resourcesSql.length+"个  最终获取=="+resourcesBig.length+"  pathList=="+pathList.size()+"个");
                System.out.println("python获取sql的个数是：==="+sqls.size()+"条");
            }else{
                System.out.println(projectName+"项目，python没有获取sql");
            }
            if(xmlFileList.size()>0){
                System.out.println("出错文件是：");
                xmlFileList.stream().forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println("====python 获取mapper文件时，可能报错=sqls==="+sqls.size());
            e.printStackTrace();
        }
        return sqls;
    }

    /**
     * 获取总数
     * @param classesUrl
     * @param projectName
     * @param name
     * @return
     */
    public static int getSqlSource2(String classesUrl, String projectName,String name){
        int sum=0;
        List<SqlTable> sqls=new ArrayList<SqlTable>();
        SqlTable sqlTable;

        String key="";
        try {
            URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
            getUnknowFilePath(classesUrl,"/WEB-INF/classes");
            String url=urlBig.substring(0,urlBig.lastIndexOf("/WEB-INF/classes"));
            File classesFile = new File(url+"/WEB-INF/classes");
            Method add = URLClassLoader.class.getDeclaredMethod("addURL", new Class[]{URL.class});
            add.setAccessible(true);
            add.invoke(classLoader, classesFile.toURI().toURL());
            //项目的lib文件
            File pathLib = new File(url+"/WEB-INF/lib");
            if(pathLib.exists()){
                if(pathLib.listFiles().length>0){
                    for (File file : pathLib.listFiles()) {
                        add.invoke(classLoader, file.toURI().toURL());
                    }
                }
            }

            PathMatchingResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
            Resource[] resourcesMapper = resolver.getResources("file:"+url+"/**/mapp*/*.xml");
            Resource[] resourcesMapperSql = resolver.getResources("file:"+url+"/**/mapp*/*/*.xml");
            Resource[] resourcesSql = resolver.getResources("file:"+url+"/**/*Mapper.xml");
            Resource[] resourcesSql1 = resolver.getResources("file:"+url+"/**/*mapper.xml");
            Resource[] resourcesBig = new Resource[resourcesMapper.length+resourcesMapperSql.length+resourcesSql.length];

            for(int i=0;i<resourcesBig.length;i++ ) {
                if (resourcesMapper.length > 0 && resourcesMapper.length > i) {
                    resourcesBig[i] = resourcesMapper[i];
                }
                if (resourcesMapperSql.length > 0 && resourcesMapper.length <= i
                        &&  resourcesBig.length -resourcesSql.length > i) {
                    resourcesBig[i] = resourcesMapperSql[i - resourcesMapper.length];
                }
                if (resourcesSql.length > 0  &&  resourcesBig.length -resourcesSql.length <= i) {
                    resourcesBig[i] = resourcesSql[i - resourcesMapper.length-resourcesMapperSql.length];
                }
            }
            List<String> pathList = Lists.newArrayList();
            for (int i = 0; i < resourcesBig.length; i++) {
                if (!pathList.contains(resourcesBig[i].getFile().getPath())) {
                    pathList.add(resourcesBig[i].getFile().getPath());
                }
            }
            if(pathList.size()>0){
                System.out.println("resourcesMapper=="+resourcesMapper.length+"   resourcesMapperSql=="+resourcesMapperSql.length+"  resourcesSql=="+resourcesSql.length+"  resourcesBig=="+resourcesBig.length+"  pathList=="+pathList.size());
            }


            //如果python没有解析成功，就要java解析
            if(pathList.size()>0){
                System.out.println("=============进入java获取数据==pathList=="+pathList.size());
                Resource[] resourcesflag = new Resource[pathList.size()];
                System.out.println("====resourcesflag=="+resourcesflag.length);
                for(int i =0;i<pathList.size();i++){
                    String xmlFilePath=pathList.get(i);
                    File file=new File(xmlFilePath);
                    Resource resource=new FileSystemResource(xmlFilePath);
                    resourcesflag[i]=resource;
                }
                //初始化mybatis 利用spring mybatis配置
                SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
                if(resourcesflag.length>0){
                    factoryBean.setMapperLocations(resourcesflag);
                }
                factoryBean.setDataSource(DUMMY_DATASOURCE);
                SqlSessionFactory build = factoryBean.getObject();
                Configuration configuration = build.getConfiguration();
                TypeHandlerRegistry typeHandlerRegistry = build.getConfiguration().getTypeHandlerRegistry();
                configuration.setJdbcTypeForNull(JdbcType.ARRAY);
                // 加载完成获取sql
                Collection<String> mappedStatementNames =  configuration.getMappedStatementNames();
                Collection<String> mappedStatementNames2 =new ArrayList<String>();
                for (String mappedStatementName : mappedStatementNames) {
                    if(mappedStatementName.contains(".")){
                        mappedStatementNames2.add(mappedStatementName);
                    }
                }
                sum=mappedStatementNames2.size();
            }
            System.out.println("====sqlTable的大小  sqls==="+sqls.size());
        } catch (Exception e) {
            System.out.println("====获取java和python 获取mapper文件时，可能报错=sqls==="+sqls.size());
            e.printStackTrace();
        }
        return sum;
    }

    private static final DataSource DUMMY_DATASOURCE=new DataSource() {
        @Override
        public Connection getConnection() throws SQLException {
            return null;
        }

        @Override
        public Connection getConnection(String username, String password) throws SQLException {
            return null;
        }

        @Override
        public <T> T unwrap(Class<T> iface) throws SQLException {
            return null;
        }

        @Override
        public boolean isWrapperFor(Class<?> iface) throws SQLException {
            return false;
        }

        @Override
        public PrintWriter getLogWriter() throws SQLException {
            return null;
        }

        @Override
        public void setLogWriter(PrintWriter out) throws SQLException {

        }

        @Override
        public void setLoginTimeout(int seconds) throws SQLException {

        }

        @Override
        public int getLoginTimeout() throws SQLException {
            return 0;
        }

        @Override
        public Logger getParentLogger() throws SQLFeatureNotSupportedException {
            return null;
        }
    };

    /**
     * 获取项目的路径
     * @param sql
     * @return
     */
    public static  List<FileHistory> getFileHistory(String sql){
        List<FileHistory> list =new ArrayList<FileHistory>();
        Connection conn = null;
        Statement stmt = null;
        // 结果集
        ResultSet resultSet = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            // 打开链接
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            // 执行添加
            stmt = conn.createStatement();
            //sql = "insert into gio_visit (visitUserId,sessionId) values (1,2)";
            resultSet=stmt.executeQuery(sql);
            FileHistory fileHistory=null;
            while (resultSet.next()) {
                fileHistory=new FileHistory();
                fileHistory.setId(resultSet.getInt("id"));
                fileHistory.setAbsolute_path(resultSet.getString("absolute_path"));
                fileHistory.setCreated_date(resultSet.getDate("created_date"));
                fileHistory.setName(resultSet.getString("name"));
                fileHistory.setPath(resultSet.getString("path"));
                fileHistory.setIs_exists(resultSet.getString("is_exists"));
                fileHistory.setModule_ename(resultSet.getString("module_ename"));
                list.add(fileHistory);
            }
            // 完成后关闭
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        return  list;
    }


    /**
     * 添加语句
     * @param sqlList
     * @return
     */
    public static  int insertOrUpdateData(List<String> sqlList ) {
        int num =0;
        //注册驱动    使用驱动连接数据库
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql1="";
        try {
            con = JDBCUtils.getConnection();
            for(String sql :sqlList){
                sql1="";
                sql1=sql;
                //System.out.println("sql========"+sql);
                stmt = con.prepareStatement(sql);
                int i =stmt.executeUpdate();
                num =num+i;// 返回值代表收到影响的行数
            }
        } catch (Exception e) {
            System.out.println("报错sql是："+sql1+"\n这里报错");
            e.printStackTrace();
        }finally {
            try {
                JDBCUtils.close(rs, stmt, con);
            }catch (SQLException e){

            }
        }
        return  num;
    }

    /**
     * 查询
     * @param sql
     * @return
     */
    public static  SqlTable seleceDataByTypeOrId(String sql,String property,String sqlProperty,Connection con ) {
        SqlTable sqlTable=new SqlTable();
        sqlTable.setChangeNum(0);
        //注册驱动    使用驱动连接数据库
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            if(con==null){
                con = JDBCUtils.getConnection();
            }

            stmt = con.prepareStatement(sql);
            rs=stmt.executeQuery(sql);
            while (rs.next()) {
                String sqlPropertyTemp =rs.getString(property).toString();
                if(sqlPropertyTemp.equals(sqlProperty)){
                    sqlTable.setChangeNum(-1);
                }else{
                    sqlTable.setChangeNum(rs.getInt("changeNum")+1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                //JDBCUtils.close(rs, stmt, con);
                if(rs!=null)
                     rs.close();
                if(stmt!=null)
                    stmt.close();
            }catch (SQLException e){
            }
        }
        return  sqlTable;
    }


    /**
     * 该方法是获取全路径，包括：前+中+后 的路径
     * @param ageKnowFile 已知 前边的路径
     * @param afterKnowFile  已知 后边的路径
     * @return
     */
    public static String getUnknowFilePath(String ageKnowFile,String afterKnowFile){
        String url="";
        File path = new File(ageKnowFile);
        if(path.exists()){
            File[] files = path.listFiles();
            if(files.length>0){
                for(int i =0;i<files.length;i++){
                    File sonFile=files[i];
                    if(sonFile.isDirectory()){
                        File newFile=new File(sonFile.toString()+afterKnowFile);
                        if(newFile.exists()){
                            urlBig=sonFile.toString()+afterKnowFile;
                            return  sonFile.toString()+afterKnowFile;
                        }else{
                            url =getUnknowFilePath(sonFile.toString(),afterKnowFile);
                        }
                    }
                }
            }
        }
        return url;
    }

    /**
     * 查看sqlflag表
     * @param sql
     * @return
     */
    public static  List<String> getSqlFlag(String sql){
        List<String> list =new ArrayList<String>();
        Connection conn = null;
        Statement stmt = null;
        // 结果集
        ResultSet resultSet = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            // 打开链接
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            // 执行添加
            stmt = conn.createStatement();
            //sql = "insert into gio_visit (visitUserId,sessionId) values (1,2)";
            resultSet=stmt.executeQuery(sql);
            String sqlFlag=null;
            while (resultSet.next()) {
                sqlFlag=resultSet.getString("module_ename")+resultSet.getString("dateName");
                list.add(sqlFlag);
            }
            // 完成后关闭
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        return  list;
    }

    /**
     * 查看sqlflag表
     * @param sql
     * @return
     */
    public static  int insertOrUpdateSqlFlag(String sql){
        int num=0;
        Connection conn = null;
        PreparedStatement stmt = null;
        // 结果集
        ResultSet resultSet = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            conn = JDBCUtils.getConnection();
            // 执行添加
            stmt = conn.prepareStatement(sql);
            num =stmt.executeUpdate();
            // 完成后关闭
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        return  num;
    }

    /**
     * 通过mapper文件获取sql语句
     * @param xmlPath
     * @return
     */
    public static String getSqlByXmlPathFromPython(String xmlPath){
        String result = "";
        xmlPath=xmlPath.replaceAll(" ","");
        try{
//            String commandStr = new String(
//                    "python D:/project/mybutisSql2/mybatis-mapper2sql-master/tests/test1.py -b "+xmlPath);
            //指定python的路径
            String commandStr = new String(
                    "python "+new MybatissqlApplication().pythonPyth+" -b "+xmlPath);
//            String commandStr = new String(
//                    "python3 /root/Desktop/mybatis-mapper2sql-master/test1.py -b "+xmlPath);
            //Create a Process instance and execute commands
            Process pr = Runtime.getRuntime().exec(commandStr);
            //Get the result produced by executing the above commands
            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line = null;

            while ((line = in.readLine()) != null)
            {
                result += line ;
            }
            result=result.replaceAll("\\\\n", " ");
            result=result.replaceAll("\\\\t", " ");
            in.close();
            pr.waitFor();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  result;
    }

    /**
     * 解析json
     * @param json
     * @return
     */
    public static Map<String, String> getMap(String json) {
        Map<String, String> map = new HashMap<String, String>();
        JSONArray jsonArray = JSONArray.fromObject(json);
        for(int i =0;i<jsonArray.size();i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Map<String, String> m = jsonObject;
            Set<String> set =m.keySet();
            for(String str:set){
                String s = m.get(str);
                map.put(str,m.get(str));
            }
        }
        return map;
    }
}

