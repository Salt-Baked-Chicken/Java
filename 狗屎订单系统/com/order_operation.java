package com;

import java.util.Scanner;

public class order_operation {
	//ip=input op=output ��˲���ģ��;
	dish op_list = new dish();
	static Scanner input = new Scanner(System.in);
	
	public static void delete_order() {
		see_order();
		System.out.println("���붩����ɾ������");
		int u_order_num = input.nextInt();
		for(int k = 0; k < order.o_data.length; k++) {
			if (order.o_data[0] == null) {
				System.out.println("û�ж�������ɾ������");
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
				System.out.println("����ѽ���������붩����");
				u_order_num = input.nextInt();
			}
		}
		see_order();
	}
	
	public static void see_order() {
		System.out.println("*****����-��Ʒ-�ܼ�-״̬-������*****");
		for(int j = 0; j < 5; j++) {
			if (order.o_data[j] != null) {
				String dname = "";
				for(int i = 0; i < 3; i++) {
					if (order.o_data[j].dish_name[i] != null) {
						dname += order.o_data[j].dish_name[i]+order.o_data[j].dish_share[i]+"��"+",";
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
		//�Ѽ��û��ύ����;
		for(; i < 3;i++) {
			order ip_list = new order();
			if (i == 0) {
				System.out.println("զ�ƺ�");
				ip_list.people_name[i] = input.next();
				System.out.println("��ַ��");
				ip_list.dish_place[i] = input.next();
				System.out.println("ɶʱ���ͣ�8����20��");
				ip_list.dish_time[i] = input.nextInt();
			}else if (i > 0) {
				ip_list.people_name[i] = o.people_name[i-1];
				ip_list.dish_place[i] = o.dish_place[i-1];
				ip_list.dish_time[i] = o.dish_time[i-1];
			}
			op_list.output_dish_list();
			System.out.println("��Ե�ɶ?�������ѡ��");
			ip_list.dish_num = input.nextInt();
			ip_list.mid = op_list.dish();
			for(int k = 0; k < 3; k++) {
				if (ip_list.dish_num == ip_list.mid[k].number[k]) {
					ip_list.dish_name[i] = ip_list.mid[k].name[k];
					System.out.println(ip_list.dish_name[0]);
					break;
				}
			}
			System.out.println("���ݣ�");
			ip_list.dish_share[i] = input.nextInt();
			//��ȡ��Ʒ����
			ip_list.mid = op_list.dish();
			for(int k = 0; k < 3; k++) {
				if (ip_list.dish_num == ip_list.mid[k].number[k]) {
					ip_list.dish_price[i] = ip_list.mid[k].price[k];
					break;
				}
			}
			//���㵥���ܶ�
			ip_list.dish_state[i] = false;
			//¼���Ʒ״̬
			for(int k = 0; k < 3; k++) {
				if (ip_list.dish_state[k] == true) {
					ip_list.dish_state_string[0] = "��ǩ��";
					break;
				}else if (ip_list.dish_state[k] == false) {
					ip_list.dish_state_string[0] = "δǩ��";
					break;
				}
			}

			//���㶩���ܶ�
			for(int k = 0; i < 3; k++) {
				if (ip_list.order_price[k] == 0) {
						ip_list.dish_priceall[k] = ip_list.dish_price[k]*ip_list.dish_share[k];
						ip_list.order_price[k] = ip_list.dish_priceall[k];
						break;
					}
				}
			//���㶩���ڵ��ε�˵��ܶ�
			if (i == 0) {
				ip_list.order_priceall[i] = ip_list.order_price[i];
				System.out.println("�ܶ�"+"\t"+ip_list.order_price[i]);
			}else if (i == 1) {
				ip_list.order_priceall[i] = ip_list.order_price[0]+ip_list.order_price[i];
				System.out.println("�ܶ�"+"\t"+(ip_list.order_priceall[i]));
			}else if (i == 2) {
				ip_list.order_priceall[i] = ip_list.order_price[0]+ip_list.order_price[1]+ip_list.order_price[i];
				System.out.println("�ܶ�"+"\t"+(ip_list.order_priceall[i]));
			}
			//������
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
			//������ʵ����Ϣ
			System.out.println("******************************");
			System.out.println("����"+"\t"+ip_list.people_name[i]);
			System.out.println("��Ʒ"+"\t"+ip_list.dish_name[i]);
			System.out.println("����"+"\t"+ip_list.dish_share[i]);
			System.out.println("����"+"\t"+ip_list.dish_price[i]);
			System.out.println("��ַ"+"\t"+ip_list.dish_place[i]);
			System.out.println("�Ͳ�ʱ��"+"\t"+ip_list.dish_time[i]+"��");
			System.out.println("******************************");
			System.out.println("�����ֵ�,��2.������� 0.����");
			key = input.nextInt();
			//2�Ǽ�����ˣ�0�ǽ������ζ���������
			if (key == 2) {
				/*
				���﷢����һ������(����bug�����)
					1.ͬһ�������еĵڶ��ε�ˣ���Ϊ�ڶ�����ѭ������ˢ�¶�������ȡ�û���Ϣ
					�ڶ���ˢ�º󣬻Ὣ��һ�ζ���ĵ�ˣ�������Ϣ���ǣ����¸��Ǻ󣬵�һ�β���û�б���
					
					
					2.����������ڼ�����˵����λ�ã���һ�ζ���Ĳ���δˢ��ǰ��
					����һ�β�������󱣴����м���������ڽ������ζ���ʱ����ֵ��ip_list.dish_name
					��󱣴���order.o_data���鵱��
					
					3.��һ����������洢����˼��Ľ���취����ר��������һ����ά�Ķ����������飬
					��������ÿ�εĲ��������������Ҳ���Ա��⸲��
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
				System.out.println("�������ϴ�����");
				break;
			}
		}
	}
}