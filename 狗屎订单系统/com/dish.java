package com;

public class dish {
	int[] price = new int[5];//�۸�
	int[] praise = new int[5];//��
	int[] number = new int[5];//���
	String[] name = new String[5];//����
	static dish[] data = new dish[5];
	
	//�������в˵����ԣ��洢��data�����ڲ����ظö��������������;
	public dish[] dish() {
		
		dish meat = new dish();
		meat.name[0] = "��ʽ������";
		meat.price[0] = 30;
		meat.praise[0] = 0;
		meat.number[0] = 1;
		
		dish vegetable = new dish();
		vegetable.name[1] = "���⿾����";
		vegetable.price[1] = 25;
		vegetable.praise[1] = 0;
		vegetable.number[1] = 2;
		
		dish baconRice = new dish();
		baconRice.name[2] = "������������";
		baconRice.price[2] = 10;
		baconRice.praise[2] = 0;
		baconRice.number[2] = 3;
		
		//�ڴ�֮����������²˶���
		
		data[0] = meat;
		data[1] = vegetable;
		data[2] = baconRice;
		
		return data;
	}
	
	//����˵�
	public static void output_dish_list() {
		System.out.println("���"+"\t"+"����"+"\t\t"+"�۸�"+"\t"+"������");
		for(int i = 0; i <= 4; i++) {
			if (data[i] != null) {
				System.out.println(data[i].number[i]+"\t"+data[i].name[i]+"\t"+data[i].price[i]+"\t"+data[i].praise[i]);
			}
		}
	}
}
