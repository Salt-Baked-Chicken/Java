package com;

public class order {
	int dish_num;
	int order_num;
	int[] dish_time = new int[3];
	int[] dish_price = new int[3];
	int[] dish_priceall = new int[3];
	int[] order_price = new int[3];
	int[] order_priceall = new int[3];
	int[] dish_share = new int[3];
	boolean[] dish_state = new boolean[3];
	
	String[] dish_state_string = new String[3];
	String[] dish_name = new String[3];
	String[] people_name = new String[3];
	String[] dish_place = new String[3];
	String[] mid_name = new String[3];
	dish[] mid = new dish[3];
	static order[] o_data = new order[5];
	//满50-配送
	//可多点菜和返回
}