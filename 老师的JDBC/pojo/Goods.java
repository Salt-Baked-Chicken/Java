package com.qhit.pojo;

/**
 * 商品信息类
 * */
public class Goods {
	private Integer id;// 商品编号
	private String name;// 商品名称
	private Double price;// 商品单价
	private Integer number;// 商品库存量
	private String describe;// 商品描述

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

}
