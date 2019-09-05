package com.qhit.dao;

import java.util.List;

import com.qhit.pojo.Goods;

public interface GoodsDao {
	List<Goods> selectAll();

	List<Goods> selectAllByCount();
	
	int insertShangPin(Goods sp);

	int updateShangPin(Goods sp);
	
	int deleteShangPin(Goods sp);
	
	int selectOneByName(String name);
	
	Goods selectOneByNameOrId(String str);
}
