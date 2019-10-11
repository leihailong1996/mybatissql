package com.ouyeel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
    private static final String connectionURL = "jdbc:mysql://10.60.145.94:3306/xservices_deploy?useUnicode=true&characterEncoding=utf8";
    private static final String username = "root";
    private static final String password = "root";
    
    //创建数据库的连接
    public static Connection getConnection() {
        try {
            return   DriverManager.getConnection(connectionURL,username,password);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return null;
    }
    
    //关闭数据库的连接
    public static void close(ResultSet rs,Statement stmt,Connection con) throws SQLException {
        if(rs!=null)
            rs.close();
        if(stmt!=null)
            stmt.close();
        if(con!=null)
            con.close();
    }
}