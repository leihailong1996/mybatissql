package com.ouyeel.mybatissql;

import com.ouyeel.pojo.FileHistory;
import com.ouyeel.pojo.SqlTable;
import com.ouyeel.util.JDBCUtils;
import com.ouyeel.util.SqlSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootApplication(scanBasePackages={"com.*"})
@EnableScheduling
public class MybatissqlApplication {
    //linux系统上的项目前面的路径
    static String projectUrl="/home/otcadmin/deploy/deploy-home/";
    //linux系统上的项目后面的路径，用于找到mapping文件的
    static String classUrlFindMapper="/target/classes/";

    public String pythonPyth=getPythonPyth();
    public static void main(String[] args)  throws  Exception{


//        SpringApplication.run(MybatissqlApplication.class, args);//
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("=============================================================");
        System.out.println("开始启动获取sql，现在时间是："+formatter.format(new Date()));
        System.out.println("=============================================================");
        System.out.println("python的路径是："+new MybatissqlApplication().pythonPyth);

//        List<FileHistory> fileHistoryListBig = SqlSource.getFileHistory("select * from file_history where  id  in (select file_history_id from pull_history where  id in (select pull_history_id from build_history where  id in (select max(id) from build_history where build_flag=1  group by module_ename) ))  and module_ename not like '%api%'");
        //加了一些特殊项目，不是maven项目，编译失败
        List<FileHistory> fileHistoryListBig = SqlSource.getFileHistory("select * from file_history where  id  in (select file_history_id from pull_history where  id in (select pull_history_id from build_history where  id in (select max(id) from build_history where build_flag=1  group by module_ename) or id IN (SELECT max( id ) FROM build_history WHERE module_ename IN ( 'ttp', 'ttp-api', 'wl-ttp', 'wl-member', 'erp', 'wbsq', 'wbsq-api', 'ng-cloudAPI', 'oyys-olms', 'partnerservice','supplierservice', 		  'tmsservice', 'settleservice' ) GROUP BY module_ename)) )  and module_ename not like '%api%'");
        List<FileHistory> fileHistoryList = new ArrayList<FileHistory>();
        List<String> sqlFlagList = SqlSource.getSqlFlag("select * from sqlflag ");
        for(int i =0;i<fileHistoryListBig.size();i++){
            String flag=fileHistoryListBig.get(i).getModule_ename()+fileHistoryListBig.get(i).getName();
            boolean flagIsNull=true;
            for(int j=0;j<sqlFlagList.size();j++){
                if(flag.equals(sqlFlagList.get(j))){
                    flagIsNull=false;
                }
            }
            if(flagIsNull){
                fileHistoryList.add(fileHistoryListBig.get(i));
            }
        }
        System.out.println("项目个数="+fileHistoryList.size());
        Date date1=new Date();
        int i =0;
//        int sum=0;
        for(FileHistory fileHistory:fileHistoryList){
            /*if(!fileHistory.getModule_ename().equals("account-ng")  ){
                continue;
            }*/
            i++;
            String classUrl=projectUrl+fileHistory.getPath();
            File file = new File(classUrl);
//            System.out.println("====classUrl="+classUrl);
            if (!file.exists()) {
                System.out.println("第"+i+"个项目，"+fileHistory.getModule_ename()+"不存在,url是："+classUrl);
            }else{
                Date date3=new Date();
                System.out.println("第"+i+"个项目，"+fileHistory.getModule_ename()+"=================存在");
//                int num1=SqlSource.getSqlSource2(classUrl,fileHistory.getModule_ename(),fileHistory.getName());
//                System.out.println("项目名字="+fileHistory.getModule_ename()+"     条数是："+num1);
//                List< SqlTable> list1 = null;
//                sum=sum+num1;
                List< SqlTable> list1 = SqlSource.getSqlSource(classUrl,fileHistory.getModule_ename(),fileHistory.getName());
                Date date4=new Date();
                System.out.println("获取项目sql，总共用的时长是："+(date4.getTime() - date3.getTime())/1000+"秒");
                List<String> sqlList=new ArrayList<String>();
                DateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   //创建一个格式化日期对象
                Map<String, Object> updateSqlUserInfoMap;
                if(list1 !=null){
                    String sql ;
                    //打开链接（对比 sql是否相等：只需要打开链接一次）
                    Connection con = JDBCUtils.getConnection();
                    for (SqlTable sqlTable:list1) {
                        updateSqlUserInfoMap=null;

                        Date date=new Date();     //获取一个Date对象
                        String punchTime = simpleDateFormat.format(date);   //格式化后的时间
                        String sqlTemp =sqlTable.getSql();
                        sqlTemp=sqlTemp.replace("\"","\\\"");
                        // ChangeNum=-1:有数据，不能添加，ChangeNum=0:没有数据，可以添加，ChangeNum>0：数据更新了，添加
                        String selectSqlFlag="select * from sqltable where path='"+sqlTable.getPath() +"' and module_ename='"+sqlTable.getModule_ename()+"' order by id desc limit 1  ";
                        SqlTable sqlTable1=SqlSource.seleceDataByTypeOrId(selectSqlFlag,"sql",sqlTable.getSql(),con);
                        if(sqlTable1.getChangeNum()!=-1){
                            updateSqlUserInfoMap = SqlSource.getUpdateSqlUserInfo(sqlTable.getFileName(), sqlTable.getPath().substring(sqlTable.getPath().lastIndexOf(".")+1,sqlTable.getPath().length()));
                            sqlTable.setSvnLastModifiedPerson(updateSqlUserInfoMap.get("lastUserName").toString());
                            sqlTable.setSvnVersion(updateSqlUserInfoMap.get("lastVersion").toString());
                            sqlTable.setSqlMethod(updateSqlUserInfoMap.get("methonName").toString());
                        }

                        if(sqlTable1.getChangeNum()==0){
                            sql="insert into sqltable (create_Date,last_modified_Date,module_ename,`sql`,path,`name`,changeNum,flag,fileName,svn_version,svn_last_modified_person,sqlmethod) " +
                                    "values('"+punchTime+"','"+punchTime+"','"+sqlTable.getModule_ename()+"',\""+
                                    sqlTemp+"\",'"+sqlTable.getPath()+"','"+sqlTable.getName()+"',0,'"+sqlTable.getFlag()+"','"+sqlTable.getFileName()+"','"+sqlTable.getSvnVersion()+"','"+sqlTable.getSvnLastModifiedPerson()+"','"+sqlTable.getSqlMethod()+"')";
                            sqlList.add(sql);
                        }else if(sqlTable1.getChangeNum()!=-1 && sqlTable1.getChangeNum()!=0){
//                            sql=" update sqltable set `sql`=\""+sqlTable.getSql()+"\",last_modified_Date='"+punchTime+"',changeNum='"+(sqlTable1.getChangeNum())+"',name='"+sqlTable.getName()+"' where module_ename='"+sqlTable.getModule_ename()
//                                    +"' and path='"+sqlTable.getPath()+"'";python获取sql的个数是
                            sql="insert into sqltable (create_Date,last_modified_Date,module_ename,`sql`,path,`name`,changeNum,flag,fileName,svn_version,svn_last_modified_person,sqlmethod) " +
                                    "values('"+punchTime+"','"+punchTime+"','"+sqlTable.getModule_ename()+"',\""+
                                    sqlTemp+"\",'"+sqlTable.getPath()+"','"+sqlTable.getName()+"',"+sqlTable1.getChangeNum()+",'"+sqlTable.getFlag()+"','"+sqlTable.getFileName()+"','"+sqlTable.getSvnVersion()+"','"+sqlTable.getSvnLastModifiedPerson()+"','"+sqlTable.getSqlMethod()+"')";
                            sqlList.add(sql);
                        }
                    }
                    Date date5=new Date();
                    System.out.println("生成sql，总共用的时长是："+(date5.getTime() - date4.getTime())/1000+"秒");
                    //关闭链接（对比 sql是否相等：只需要打开链接一次）
                    con.close();
                    int num =SqlSource.insertOrUpdateData(sqlList);
                    Date date6=new Date();
                    System.out.println("添加sql，总共用的时长是："+(date6.getTime() - date5.getTime())/1000+"秒");
                    if(num>0){
                        System.out.println("添加sqltabel成功,添加了"+num+"条数据");
                    }else{
                        System.out.println("没有需要添加的sql语句。");
                    }
                    if(num>0){
                        List<String> sqlFlagListSize = SqlSource.getSqlFlag("select * from sqlflag where module_ename='"+fileHistory.getModule_ename()+"'" );
                        if(sqlFlagListSize.size()>0){
                            int flag=SqlSource.insertOrUpdateSqlFlag(" update sqlflag set dateName ='"+fileHistory.getName()+"' where  module_ename='"+fileHistory.getModule_ename()+"'");
                            if(flag>0){
//                                System.out.println("更新sqlflag表成功");
                            }
                        }else{
                            int flag=SqlSource.insertOrUpdateSqlFlag(" insert into  sqlflag(module_ename,dateName) values ( '"+fileHistory.getModule_ename()+"','"+fileHistory.getName()+"')");
                            if(flag>0){
//                                System.out.println("添加sqlflag表成功");
                            }
                        }
                    }
                }
            }
        }
//        System.out.println("========== sql的总条数是"+sum);
        Date date2=new Date();
        long diff = date2.getTime() - date1.getTime();
        long time = diff /60000;
        System.out.println("=============================================================");
        System.out.println("运行结束，总共用的时长是："+time+"分");
        System.out.println("=============================================================");


         //本地测试
//        List< SqlTable> list2 = SqlSource.getSqlSource("D:/1/","abcd=","abcde=");
//        List< SqlTable> list3 = SqlSource.getSqlSource("/root/Desktop/","abcd=","abcde=");

    }


    /**
     * 从config.properties 文本里面获取python文本的路径
     * @return
     */
    public  String getPythonPyth() {
        String s="";
        String data="";
        try {
            InputStream is=this.getClass().getResourceAsStream("/config.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            while((s=br.readLine())!=null)
                data=data+s;
        }catch (Exception e){
            e.printStackTrace();
        }
        if("".equals(data)){
            data="/home/otcadmin/pythonMybatis/mybatis-mapper2sql-master/test1.py";
        }
        return data;
    }
}
