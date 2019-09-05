package com;

public class dish {
	int[] price = new int[5];//价格
	int[] praise = new int[5];//赞
	int[] number = new int[5];//序号
	String[] name = new String[5];//菜名
	static dish[] data = new dish[5];
	
	//定义所有菜的属性，存储进data对象内并返回该对象用于输出调用;
	public dish[] dish() {
		
		dish meat = new dish();
		meat.name[0] = "广式红烧肉";
		meat.price[0] = 30;
		meat.praise[0] = 0;
		meat.number[0] = 1;
		
		dish vegetable = new dish();
		vegetable.name[1] = "油蒜烤茄子";
		vegetable.price[1] = 25;
		vegetable.praise[1] = 0;
		vegetable.number[1] = 2;
		
		dish baconRice = new dish();
		baconRice.name[2] = "猪脸腊肉蒸饭";
		baconRice.price[2] = 10;
		baconRice.praise[2] = 0;
		baconRice.number[2] = 3;
		
		//在此之后可以输入新菜对象
		
		data[0] = meat;
		data[1] = vegetable;
		data[2] = baconRice;
		
		return data;
	}
	
	//输出菜单
	public static void output_dish_list() {
		System.out.println("序号"+"\t"+"菜名"+"\t\t"+"价格"+"\t"+"点赞数");
		for(int i = 0; i <= 4; i++) {
			if (data[i] != null) {
				System.out.println(data[i].number[i]+"\t"+data[i].name[i]+"\t"+data[i].price[i]+"\t"+data[i].praise[i]);
			}
		}
	}
}
