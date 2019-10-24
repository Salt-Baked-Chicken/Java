package com.Dao;

import com.bean.books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class select_c {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/books";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123";

    public List<books> s() {
        List<books> ta = new ArrayList<books>();
        return bbc(ta, DRIVER_NAME, URL, USER_NAME, PASSWORD);
    }

    static List<books> bbc(List<books> ta, String driverName, String url, String userName, String password) {
        Connection connection;
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, userName, password);
            String sql = "SELECT * FROM `books`";
            PreparedStatement prst = connection.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            books b = null;
            while (rs.next()) {
                b = new books();
                b.setName(rs.getString("book"));
                b.setAuther(rs.getString("auther"));

                System.out.print("书名:");
                System.out.print(b.getName());
                System.out.print("    ");
                System.out.print("作者:");
                System.out.println(b.getAuther());
                ta.add(b);
            }
            rs.close();
            prst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ta;
    }
}
