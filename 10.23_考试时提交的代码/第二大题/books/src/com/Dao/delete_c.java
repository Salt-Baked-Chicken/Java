package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete_c {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/books";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123";
    public int de(String d_num) {
        return bbc(d_num,DRIVER_NAME, URL, USER_NAME, PASSWORD);
    }

    static int bbc (String book_name,String driverName, String url, String userName, String password) {
        int a = 0;
        Connection connection;
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);
            String sql = "delete from books where book = ?";
            PreparedStatement prst = connection.prepareStatement(sql);
            prst.setString(1,book_name);
            System.out.println("成功删除" + book_name + "这本书");
            System.out.println("=================================");
            a = 1;
            prst.execute();
            prst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
}
