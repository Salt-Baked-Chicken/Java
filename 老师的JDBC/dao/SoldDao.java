package com.qhit.dao;

import java.util.Date;
import java.util.List;

import com.qhit.pojo.Sold;

public interface SoldDao {
	boolean sold(List<Sold> solds);
	
	List<Sold> selectAllSolds();
	
	List<Sold> selectAllSoldByGoodsName(String name);
	
	double selectSoldsByTime(Date start,Date end);
}
