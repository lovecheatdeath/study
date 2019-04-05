package com.hjh.service;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtils {
    //获取连接
    public static Connection getConnection() {
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/student_info?useUnicode=true&useSSL=false&characterEncoding=utf-8&serverTime=GMT%2B8";
        String user = "root";
        String password = "123456";
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("连接成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    //关闭连接关闭顺序ResultSet,Statement,Connection
       public static void free(ResultSet rs,Statement st,Connection con){
        try{
            if(null!=rs);
            {
//                rs.close();
                rs = null;
            }
            if(null!=st) {
                st.close();
                st = null;
            }
            if(null!=con) {
                con.close();
                con = null;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}