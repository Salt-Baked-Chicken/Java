package com;
import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class merchants_interface {
	int m_account = 1;
	int m_password = 2;
	Scanner input = new Scanner(System.in);
	
	//�̼�ҳ��
	public void merchants() {
		System.out.println("*****��ӭ�����̼ҽ���*****");
		System.out.println("�̼ҵ�½���棬�����˺� //�˺�1������2");
		int a = input.nextInt();
		System.out.println("��������");
		int b = input.nextInt();
		if (a == m_account || b == m_password) {
			int key = 1;
			System.out.println("��½�ɹ�,��ӭ�����̼ҽ���");
			while(key != 0) {
				System.out.println("*******************");
				System.out.println("0.�����ϼ�");
				System.out.println("1.�鿴�˵�");
				System.out.println("2.ɾ������");
				System.out.println("3.����²�");
				System.out.println("4.�ɲ��¼�");
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
			System.out.println("��½ʧ�ܣ������ϼ�");
		}
	}
	
	public void delete_dish() {
		System.out.println("��������ɾ���Ĳ˺�");
		int a = input.nextInt();
		for(int i = 0; i < dish.data.length; i++) {
			System.out.println(i);
			if (a == dish.data[i].number[i]) {
				dish.data[i] = null;
				System.out.println("����");
				dish.output_dish_list();
				break;
			}
		}
	}
	
	//����²�
	public dish[] adddish() {
		dish adddish = new dish();
		adddish.dish();
		for(int i = 0; i < adddish.data.length; i++) {
			if (dish.data[i] == null) {
				System.out.println("����������ӵĲ���");
				adddish.name[i] = input.next();
				System.out.println("��������˵ļ۸�");
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
