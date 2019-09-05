package com.qhit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.qhit.dao.BaseDao;
import com.qhit.dao.SoldDao;
import com.qhit.pojo.Sold;

public class SoldDaoImpl extends BaseDao implements SoldDao {

	@Override
	public boolean sold(List<Sold> solds) {
		boolean flag = true;
		for (int i = 0; i < solds.size(); i++) {
			String sql = "insert into sold(goods_id,count,price,time) values(?,?,?,?)";
			Object[] param = { solds.get(i).getGoods_id(), solds.get(i).getCount(), solds.get(i).getPrice(),
					solds.get(i).getTime() };
			int count = this.executeUpdate(sql, param);
			if (count <= 0) {
				flag = false;
			}
		}
		return flag;
	}

	@Override
	public List<Sold> selectAllSolds() {
		// 获取连接
		Connection con = this.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		// 编写sql语句
		String sql = "select * from sold";
		Sold sp = null;
		List<Sold> list = null;
		try {
			// 创建接收的集合
			list = new ArrayList<Sold>();
			// 发送并执行sql语句返回结果集
			ps = con.prepareStatement(sql);
			// 处理结果集
			rs = ps.executeQuery();
			while (rs.next()) {
				sp = new Sold();
				sp.setId(rs.getInt("id"));
				sp.setGoods_id(rs.getInt("Goods_id"));
				sp.setCount(rs.getInt("count"));
				sp.setPrice(rs.getDouble("price"));
				sp.setTime(rs.getDate("time"));
				list.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, ps, rs);
		}
		return list;
	}

	@Override
	public List<Sold> selectAllSoldByGoodsName(String name) {
		// 获取连接
		Connection con = this.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		// 编写sql语句
		String sql = "select s.* from sold s,goods g where s.goods_id=g.id and g.name=? ";
		Sold sp = null;
		List<Sold> list = null;
		try {
			// 创建接收的集合
			list = new ArrayList<Sold>();
			// 发送并执行sql语句返回结果集
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			// 处理结果集
			rs = ps.executeQuery();
			while (rs.next()) {
				sp = new Sold();
				sp.setId(rs.getInt("id"));
				sp.setGoods_id(rs.getInt("Goods_id"));
				sp.setCount(rs.getInt("count"));
				sp.setPrice(rs.getDouble("price"));
				sp.setTime(rs.getDate("time"));
				list.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeAll(con, ps, rs);
		}
		return list;
	}

	@Override
	public double selectSoldsByTime(Date start, Date end) {
		// 获取连接
		Connection con = this.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		double sum = 0;
		// 编写sql语句
		String sql = "select sum(price) from sold where time BETWEEN ? and ?";
		try {
			ps = con.prepareStatement(sql);
			java.sql.Date sqlStartDate = new java.sql.Date(start.getTime());
			java.sql.Date sqlEndDate = new java.sql.Date(end.getTime());
			ps.setDate(1, sqlStartDate);
			ps.setDate(2, sqlEndDate);
			rs = ps.executeQuery();
			while (rs.next()) {
				sum = rs.getDouble(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sum;
	}

}
