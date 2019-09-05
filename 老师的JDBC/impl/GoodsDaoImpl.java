package com.qhit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qhit.dao.BaseDao;
import com.qhit.dao.GoodsDao;
import com.qhit.pojo.Goods;

public class GoodsDaoImpl extends BaseDao implements GoodsDao {
	/**
	 * 查询所有商品信息的方法
	 * */
	@Override
	public List<Goods> selectAll() {
		//获取连接
		Connection con = this.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		//编写sql语句
		String sql = "select * from goods";
		Goods sp = null;
		List<Goods> list = null;
		try {
			//创建接收的集合
			list = new ArrayList<Goods>();
			//发送并执行sql语句返回结果集
			ps = con.prepareStatement(sql);
			//处理结果集
			rs = ps.executeQuery();
			while (rs.next()) {
				sp = new Goods();
				sp.setId(rs.getInt("id"));
				sp.setName(rs.getString("name"));
				sp.setPrice(rs.getDouble("price"));
				sp.setNumber(rs.getInt("number"));
				sp.setDescribe(rs.getString("describe"));
				list.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeAll(con, ps, rs);
		}
		return list;
	}
	
	/**
	 * 查询所有库存为0的商品信息的方法
	 * */
	@Override
	public List<Goods> selectAllByCount() {
		//获取连接
		Connection con = this.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		//编写sql语句
		String sql = "select * from goods where number = 0";
		Goods sp = null;
		List<Goods> list = null;
		try {
			//创建接收的集合
			list = new ArrayList<Goods>();
			//发送并执行sql语句返回结果集
			ps = con.prepareStatement(sql);
			//处理结果集
			rs = ps.executeQuery();
			while (rs.next()) {
				sp = new Goods();
				sp.setId(rs.getInt("id"));
				sp.setName(rs.getString("name"));
				sp.setPrice(rs.getDouble("price"));
				sp.setNumber(rs.getInt("number"));
				sp.setDescribe(rs.getString("describe"));
				list.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeAll(con, ps, rs);
		}
		return list;
	}

	/**
	 * 添加商品的方法
	 * */
	@Override
	public int insertShangPin(Goods sp) {
		String preparedsql = "insert into goods values (?,?,?,0,?)";
		Object[] param = { sp.getId(), sp.getName(), sp.getPrice(),
				sp.getDescribe()};
		return this.executeUpdate(preparedsql, param);
	}

	/**
	 * 修改商品库存数量的方法
	 * */
	@Override
	public int updateShangPin(Goods sp) {
		String preparedsql = "update goods set number=? where id=?";
		Object[] param = { sp.getNumber(), sp.getId() };
		return this.executeUpdate(preparedsql, param);
	}
	

	/**
	 * 删除商品的方法
	 * */
	@Override
	public int deleteShangPin(Goods sp) {
		String preparedsql = "delete from goods where id=?";
		Object[] param = { sp.getId() };
		return this.executeUpdate(preparedsql, param);
	}

	@Override
	public int selectOneByName(String name) {
		Connection con = this.getConnection();
		String preparedsql = "select * from goods where name=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count=0;
		try {
			//创建接收的集合
			//发送并执行sql语句返回结果集
			ps = con.prepareStatement(preparedsql);
			ps.setString(1, name);
			//处理结果集
			rs = ps.executeQuery();
			if(rs.next()){
				count++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeAll(con, ps, rs);
		}
		return count;
	}

	@Override
	public Goods selectOneByNameOrId(String str) {
		Connection con = this.getConnection();
		String preparedsql = "select * from goods where name=? or id=?";
		PreparedStatement ps = null;
		Goods sp = null;
		ResultSet rs = null;
		try {
			//创建接收的集合
			//发送并执行sql语句返回结果集
			ps = con.prepareStatement(preparedsql);
			ps.setString(1, str);
			ps.setString(2, str);
			//处理结果集
			rs = ps.executeQuery();
			while (rs.next()) {
				sp = new Goods();
				sp.setId(rs.getInt("id"));
				sp.setName(rs.getString("name"));
				sp.setPrice(rs.getDouble("price"));
				sp.setNumber(rs.getInt("number"));
				sp.setDescribe(rs.getString("describe"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeAll(con, ps, rs);
		}
		return sp;
	}

}
