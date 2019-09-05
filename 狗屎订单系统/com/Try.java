package com;

import java.util.Scanner;

public class Try {
	order_operation operation = new order_operation();
	public void text() {
		int key = 0;
		merchants_interface interfacea = new merchants_interface();
		dish.data = operation.op_list.dish();
		
		Scanner input = new Scanner(System.in);
			while(true) {
			System.out.println("***欢迎来到写到吐血订餐系统***");
			System.out.println("输入1.用户登陆 2.商家登陆界面");
			key = input.nextInt();
			switch (key) {
				case 1:
					user_interface();
					continue;
				case 2:
					interfacea.merchants();
					continue;
			}
		}
	}
	public void user_interface() {
		int key = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("*****欢迎来到shit订单系统——用户页面*****");
		System.out.println("1.订餐");
		System.out.println("2.查看订单");
		System.out.println("3.删除订单");
		System.out.println("4.返回上级界面");
		System.out.println("****************************************");
		while(key != 4) {
			key = input.nextInt();
			switch (key) {
				case 1:
					operation.order_dish();
					System.out.println("1.订餐");
					System.out.println("2.查看订单");
					System.out.println("3.删除订单");
					System.out.println("4.返回上级界面");
					continue;
				case 2:
					order_operation.see_order();
					System.out.println("1.订餐");
					System.out.println("2.查看订单");
					System.out.println("3.删除订单");
					System.out.println("4.返回上级界面");
					continue;
				case 3:
					order_operation.delete_order();
					System.out.println("1.订餐");
					System.out.println("2.查看订单");
					System.out.println("3.删除订单");
					System.out.println("4.返回上级界面");
					continue;
				case 4:
					key = 4;
					break;
			}
		}
	}
}
