package com;

import java.util.Scanner;

public class order_operation {
	//ip=input op=output 点菜操作模块;
	dish op_list = new dish();
	static Scanner input = new Scanner(System.in);
	
	public static void delete_order() {
		see_order();
		System.out.println("输入订单号删除订单");
		int u_order_num = input.nextInt();
		for(int k = 0; k < order.o_data.length; k++) {
			if (order.o_data[0] == null) {
				System.out.println("没有订单，你删个粑粑");
				break;
			}else if (u_order_num == order.o_data[k].order_num) {
				order.o_data[k] = null;
				for(int j = 0; j < order.o_data.length; j++) {
					if (order.o_data[k+1] != null) {
						order.o_data[k] = order.o_data[k+1];
						order.o_data[k+1] = null;
					}
				}
				break;
			}else {
				System.out.println("不对呀，重新输入订单号");
				u_order_num = input.nextInt();
			}
		}
		see_order();
	}
	
	public static void see_order() {
		System.out.println("*****姓名-菜品-总价-状态-订单号*****");
		for(int j = 0; j < 5; j++) {
			if (order.o_data[j] != null) {
				String dname = "";
				for(int i = 0; i < 3; i++) {
					if (order.o_data[j].dish_name[i] != null) {
						dname += order.o_data[j].dish_name[i]+order.o_data[j].dish_share[i]+"份"+",";
					}
				}
				for(int i = 0; i < 3; i++) {
					if (order.o_data[j].people_name[i] != null) {
						System.out.println((j+1)+"\t"+
							order.o_data[j].people_name[i]+"\t"+
							dname+"\t"+
							order.o_data[j].order_priceall[i]+"\t"+
							order.o_data[j].dish_state_string[i]+"\t"+
							order.o_data[j].order_num);
					}
				}
			}
		}
		System.out.println("****************************");
	}

	int key = 0;
	public void order_dish() {
		order o = new order();
		int i = 0;
		//搜集用户提交数据;
		for(; i < 3;i++) {
			order ip_list = new order();
			if (i == 0) {
				System.out.println("咋称呼");
				ip_list.people_name[i] = input.next();
				System.out.println("地址？");
				ip_list.dish_place[i] = input.next();
				System.out.println("啥时候送？8——20点");
				ip_list.dish_time[i] = input.nextInt();
			}else if (i > 0) {
				ip_list.people_name[i] = o.people_name[i-1];
				ip_list.dish_place[i] = o.dish_place[i-1];
				ip_list.dish_time[i] = o.dish_time[i-1];
			}
			op_list.output_dish_list();
			System.out.println("想吃点啥?输入序号选菜");
			ip_list.dish_num = input.nextInt();
			ip_list.mid = op_list.dish();
			for(int k = 0; k < 3; k++) {
				if (ip_list.dish_num == ip_list.mid[k].number[k]) {
					ip_list.dish_name[i] = ip_list.mid[k].name[k];
					System.out.println(ip_list.dish_name[0]);
					break;
				}
			}
			System.out.println("几份？");
			ip_list.dish_share[i] = input.nextInt();
			//提取菜品单价
			ip_list.mid = op_list.dish();
			for(int k = 0; k < 3; k++) {
				if (ip_list.dish_num == ip_list.mid[k].number[k]) {
					ip_list.dish_price[i] = ip_list.mid[k].price[k];
					break;
				}
			}
			//计算单次总额
			ip_list.dish_state[i] = false;
			//录入菜品状态
			for(int k = 0; k < 3; k++) {
				if (ip_list.dish_state[k] == true) {
					ip_list.dish_state_string[0] = "已签收";
					break;
				}else if (ip_list.dish_state[k] == false) {
					ip_list.dish_state_string[0] = "未签收";
					break;
				}
			}

			//计算订单总额
			for(int k = 0; i < 3; k++) {
				if (ip_list.order_price[k] == 0) {
						ip_list.dish_priceall[k] = ip_list.dish_price[k]*ip_list.dish_share[k];
						ip_list.order_price[k] = ip_list.dish_priceall[k];
						break;
					}
				}
			//计算订单内单次点菜的总额
			if (i == 0) {
				ip_list.order_priceall[i] = ip_list.order_price[i];
				System.out.println("总额"+"\t"+ip_list.order_price[i]);
			}else if (i == 1) {
				ip_list.order_priceall[i] = ip_list.order_price[0]+ip_list.order_price[i];
				System.out.println("总额"+"\t"+(ip_list.order_priceall[i]));
			}else if (i == 2) {
				ip_list.order_priceall[i] = ip_list.order_price[0]+ip_list.order_price[1]+ip_list.order_price[i];
				System.out.println("总额"+"\t"+(ip_list.order_priceall[i]));
			}
			//订单号
			for(int w = 0; w < order.o_data.length; w++) {
				if (order.o_data[w] != null) {
					if (order.o_data[w].order_num != 0) {
						ip_list.order_num = (order.o_data[w].order_num+1);
						break;
					}
				}else {
					ip_list.order_num = 1;
					break;
				}
			}
			for(int j = 0; j < order.o_data.length; j++) {
				if (order.o_data[j] != null) {
					if (ip_list.order_num == order.o_data[j].order_num) {
						ip_list.order_num = ip_list.order_num+1;
						
					}
				}
			}
			//输出单词点菜信息
			System.out.println("******************************");
			System.out.println("姓名"+"\t"+ip_list.people_name[i]);
			System.out.println("菜品"+"\t"+ip_list.dish_name[i]);
			System.out.println("份数"+"\t"+ip_list.dish_share[i]);
			System.out.println("单价"+"\t"+ip_list.dish_price[i]);
			System.out.println("地址"+"\t"+ip_list.dish_place[i]);
			System.out.println("送餐时间"+"\t"+ip_list.dish_time[i]+"点");
			System.out.println("******************************");
			System.out.println("成啦兄弟,按2.继续点菜 0.返回");
			key = input.nextInt();
			//2是继续点菜，0是结束单次订单并保存
			if (key == 2) {
				/*
				这里发现了一个问题(巨型bug大怪兽)
					1.同一订单当中的第二次点菜，因为第二次在循环体内刷新对象来获取用户信息
					第二次刷新后，会将第一次对象的点菜，菜名信息覆盖，导致覆盖后，第一次菜名没有保存
					
					
					2.解决方法，在继续点菜的这个位置，第一次对象的菜名未刷新前，
					将第一次菜名跨对象保存在中间变量，并在结束本次订单时，赋值回ip_list.dish_name
					最后保存在order.o_data数组当中
					
					3.另一个符合数组存储调用思想的解决办法，再专门拉出来一个二维的订单菜名数组，
					单独保存每次的菜名，单独输出，也可以避免覆盖
				*/
				o = ip_list;
				continue;
			}else if (key == 0) {
				for(int k = 0; k < 5; k++) {
					if (order.o_data[k] == null) {
						order.o_data[k] = ip_list;
						break;
					}else {
						continue;
					}
				}
				System.out.println("订单已上传保存");
				break;
			}
		}
	}
}