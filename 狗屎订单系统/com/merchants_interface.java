package com;
import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class merchants_interface {
	int m_account = 1;
	int m_password = 2;
	Scanner input = new Scanner(System.in);
	
	//商家页面
	public void merchants() {
		System.out.println("*****欢迎来到商家界面*****");
		System.out.println("商家登陆界面，输入账号 //账号1，密码2");
		int a = input.nextInt();
		System.out.println("输入密码");
		int b = input.nextInt();
		if (a == m_account || b == m_password) {
			int key = 1;
			System.out.println("登陆成功,欢迎进入商家界面");
			while(key != 0) {
				System.out.println("*******************");
				System.out.println("0.返回上级");
				System.out.println("1.查看菜单");
				System.out.println("2.删除订单");
				System.out.println("3.添加新菜");
				System.out.println("4.旧菜下架");
				System.out.println("*******************");
				key = input.nextInt();
				switch (key) {
				case 0:
					key = 0;
					System.out.println("1");
					break;
				case 1:
					dish.output_dish_list();
					continue;
				case 2:
					order_operation.delete_order();
					continue;
				case 3:
					adddish();
					continue;
				case 4:
					delete_dish();
					continue;
				}
			}
		}else {
			System.out.println("登陆失败，返回上级");
		}
	}
	
	public void delete_dish() {
		System.out.println("输入你想删除的菜号");
		int a = input.nextInt();
		for(int i = 0; i < dish.data.length; i++) {
			System.out.println(i);
			if (a == dish.data[i].number[i]) {
				dish.data[i] = null;
				System.out.println("成了");
				dish.output_dish_list();
				break;
			}
		}
	}
	
	//添加新菜
	public dish[] adddish() {
		dish adddish = new dish();
		adddish.dish();
		for(int i = 0; i < adddish.data.length; i++) {
			if (dish.data[i] == null) {
				System.out.println("输入你想添加的菜名");
				adddish.name[i] = input.next();
				System.out.println("输入这个菜的价格");
				adddish.price[i] = input.nextInt();
				
				adddish.number[i] = (i+1);
				adddish.praise[i] = 0;
				dish.data[i] = adddish;
				System.out.println(dish.data[3].name[3]);
				dish.output_dish_list();
				return dish.data;
			}
		}
		return dish.data;
	}
}
