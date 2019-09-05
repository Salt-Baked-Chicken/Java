package com.qhit.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.beanutils.BeanUtils;
public class BaseDao {
	/*private static String driver;
	private static String url;
	private static String user;
	private static String password;
	Connection con = null;
	
	static{
		init();
	}
	*//**
	 * 读取配置文件中的内容的方法
	 * *//*
	public static void init(){
		Properties params = new Properties();
		String configFile="database.propertise";
		InputStream is = BaseDao.class.getClassLoader().getResourceAsStream(configFile);
		try {
			params.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver=params.getProperty("driver");
		url=params.getProperty("url");
		user=params.getProperty("user");
		password=params.getProperty("password");
	}*/
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	Connection con=null;
	static{
		init();
	}
	public static void init(){
		Properties params=new Properties();
		String configFile="database.properties";
		InputStream is=BaseDao.class.getClassLoader().getResourceAsStream(configFile);
		try {
			params.load(is);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver=params.getProperty("driver");
		url=params.getProperty("url");
		user=params.getProperty("user");
		password=params.getProperty("password");
	}
	/**
	 * 获取连接的方法
	 * */
	public Connection getConnection(){
		if(con==null){
			try {
				Class.forName(driver);
				con=DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	/**
	 * 关闭连接的方法
	 * */
	public void closeAll(Connection con,PreparedStatement ps,ResultSet rs){
			try {
				if(rs!=null){
					rs.close();
				}	
				if(ps!=null){
					ps.close();
				}	
				if(con!=null){
					con.close();
					this.con = null;
				}	
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	/**
	 * 添加数据的方法
	 * */
	public int executeUpdate(String preparedsql,Object[] param){
		PreparedStatement ps = null;
		int num = 0 ;
		con = getConnection();
		try {
			ps = con.prepareStatement(preparedsql);
			if(param!=null){
				for (int i = 0; i < param.length; i++) {
					ps.setObject(i+1, param[i]);
				}
			}
			num = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeAll(con, ps, null);
		}
		return num;
	}
	
	//据说是但也不知道到底是不是一个诡异的查询的函数
	public <T> List<T> seles(String sql,Object [] par,Class<T> clazz){
		Connection conn = null;
		 conn = this.getConnection();
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 List<T> list=new ArrayList<T>();
		 T n=null;
		 try {
			ps=conn.prepareStatement(sql);
			 int paramsCount = ps.getParameterMetaData().getParameterCount();
			 //设置占位符参数的值
			 if(par!=null && par.length>0){
				 //循环给参数赋值
				 for(int i=0; i<paramsCount; i++){
					 ps.setObject(i+1, par[i]);
				 }
			 }
			 //执行查询
			 rs = ps.executeQuery();
			 //获取结果集元数据
			 ResultSetMetaData rsMeta = rs.getMetaData();
			 //获取列的个数
			 int columnCount = rsMeta.getColumnCount();
			 //遍历结果集，迭代每一行
			 while(rs.next()){
				 //创建要封装的T对象
				 try {
					n = clazz.newInstance();
					 //遍历每一行的每一列
					 for(int i=0; i<columnCount; i++){
						 //获取每一列的名称
						 String columnName = rsMeta.getColumnName(i+1);
						 //获取该行对应列名称的值
						 Object objectValue = rs.getObject(columnName);
						 //利用BeanUtils将属性拷贝到对象中
						//注意日期类型的数据保存，需要注册日期类型注册前
						 BeanUtils.copyProperty(n, columnName, objectValue);
					 }
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				 //将封装完毕的t对象存入list集合中
				 list.add(n);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeAll(conn, ps, rs);
		}
		return list;
		
	}
}
