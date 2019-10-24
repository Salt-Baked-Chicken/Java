package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class add_c {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/books";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123";
    public int add_book(String book_name,String book_auther) {
        return bbc(book_name,book_auther,DRIVER_NAME, URL, USER_NAME, PASSWORD);
    }

    static int bbc (String book, String auther, String driverName, String url, String userName, String password) {
        int a = 0;
        Connection connection;
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);
            String sql = "insert into books(book,auther) VALUES(?,?)";
            PreparedStatement prst = connection.prepareStatement(sql);
            prst.setString(1,book);
            prst.setString(2,auther);
            System.out.println("成功增加" + book + "这本书");
            System.out.println("=================================");
            prst.execute();
            a = 1;
            prst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
}
