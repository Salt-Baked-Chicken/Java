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
			System.out.println("***��ӭ����д����Ѫ����ϵͳ***");
			System.out.println("����1.�û���½ 2.�̼ҵ�½����");
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
		System.out.println("*****��ӭ����shit����ϵͳ�����û�ҳ��*****");
		System.out.println("1.����");
		System.out.println("2.�鿴����");
		System.out.println("3.ɾ������");
		System.out.println("4.�����ϼ�����");
		System.out.println("****************************************");
		while(key != 4) {
			key = input.nextInt();
			switch (key) {
				case 1:
					operation.order_dish();
					System.out.println("1.����");
					System.out.println("2.�鿴����");
					System.out.println("3.ɾ������");
					System.out.println("4.�����ϼ�����");
					continue;
				case 2:
					order_operation.see_order();
					System.out.println("1.����");
					System.out.println("2.�鿴����");
					System.out.println("3.ɾ������");
					System.out.println("4.�����ϼ�����");
					continue;
				case 3:
					order_operation.delete_order();
					System.out.println("1.����");
					System.out.println("2.�鿴����");
					System.out.println("3.ɾ������");
					System.out.println("4.�����ϼ�����");
					continue;
				case 4:
					key = 4;
					break;
			}
		}
	}
}
