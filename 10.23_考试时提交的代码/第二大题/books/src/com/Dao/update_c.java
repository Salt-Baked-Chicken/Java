package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update_c {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/books";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123";
    public int update(String book_name,String book_aulter) {
        return bbc(book_name,book_aulter,DRIVER_NAME, URL, USER_NAME, PASSWORD);
    }

    static int bbc (String book_name,String book_aulter,String driverName, String url, String userName, String password) {
        int a = 0;
        Connection connection;
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);
            connection.setAutoCommit(false);
            String sql = "update books set auther=? where book=?;";
            PreparedStatement prst = connection.prepareStatement(sql);
            prst.setString(1,book_aulter);
            prst.setString(2,book_name);
            prst.executeUpdate();
            System.out.println("成功修改书籍信息作者为" + book_aulter);
            System.out.println("=================================");
            a = 1;
            connection.commit();
            prst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
}
