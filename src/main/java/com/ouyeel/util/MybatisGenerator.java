package com.ouyeel.util;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.scripting.xmltags.DynamicSqlSource;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MybatisGenerator {

    public static void main(String arg[]){
        try {
//            项目的class文件
            File path2ProjectClass = new File("C:\\Users\\雷海龙\\Desktop\\project_War\\xservices-deploy\\BOOT-INF\\classes\\");
//            mapper中许多domain通过 api jar包引入，需要加到classpath
            File path2ProjectLib = new File("C:\\Users\\雷海龙\\Desktop\\project_War\\xservices-deploy\\BOOT-INF\\lib\\");
//           mapper 的地址，为与项目保持一致使用spring mybatis语法
            String path2MappingFile="classpath*:mapping\\*.xml";
            //String path2MappingFile="C:\\Users\\雷海龙\\Desktop\\project_War\\xservices-deploy\\BOOT-INF\\classes\\mapping\\*.xml";


//            添加所需类去classpath中
            URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
            Method add = URLClassLoader.class.getDeclaredMethod("addURL", new Class[]{URL.class});
            add.setAccessible(true);
            add.invoke(classLoader, path2ProjectClass.toURI().toURL());
            for (File file : path2ProjectLib.listFiles()) {
                add.invoke(classLoader, file.toURI().toURL());
            }
//            初始化mybatis 利用spring mybatis配置
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            factoryBean.setMapperLocations(resolver.getResources(path2MappingFile));
            factoryBean.setDataSource(DUMMY_DATASOURCE);
            SqlSessionFactory build = factoryBean.getObject();
            build.openSession();
            Configuration configuration = build.getConfiguration();

//            加载完成获取sql
            Collection<String> mappedStatementNames =  configuration.getMappedStatementNames();
            Collection<String> mappedStatementNames2 =new ArrayList<String>();
            for (String mappedStatementName : mappedStatementNames) {
                if(mappedStatementName.contains(".")){
                    mappedStatementNames2.add(mappedStatementName);
                }
            }
            Workbook workbook=new XSSFWorkbook();
            Sheet sheet = workbook.createSheet();
            int row=0;
            for (String mappedStatementName : mappedStatementNames2) {
                MappedStatement mappedStatement =   configuration.getMappedStatement(mappedStatementName,false);
                try {
                    SqlSource sqlSource = mappedStatement.getSqlSource();
                    BoundSql boundSql = mappedStatement.getBoundSql("");

                    mappedStatement.getBoundSql(null).getSql();
                    String sql = mappedStatement.getBoundSql(null).getSql();
                    //sql默认带有多行，将其去除
                    String s = sql.replaceAll("\\s+", " ");
                    Row row1 = sheet.createRow(row++);
                    row1.createCell(0).setCellValue(mappedStatement.getId());
                    row1.createCell(1).setCellValue(s);

                }catch (Exception e){
                    Row row1 = sheet.createRow(row++);
                    row1.createCell(0).setCellValue(mappedStatement.getId());
                    row1.createCell(1).setCellValue("sql:过于复杂，没有获取到");
                    e.printStackTrace();
//                    todo：空输入对list类型不支持，还有一些少数的错误，需要根据错误类型判断后，完善
                }
            }

            FileOutputStream out = new FileOutputStream( new File("jk-misc.xlsx"));
            workbook.write(out);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
