package ��ˬѩ���˻�ϵͳ;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 * @auther ������
 * @�汾 1.21.0
 */
public class Jie {
	public void Jone() {
		Ussser[] sql = new Ussser[10];//����
		Scanner input = new Scanner(System.in);
		for(int i = 0; i >= 0; i++) {
			Ussser ussser = new Ussser();
			System.out.println("fucu,welcome,1.ע�ᣬ2.��½��3����ѯ");
			int q = input.nextInt();
			switch (q) {
			case 1:
				System.out.println("ע���ޣ���������");
				ussser.name = input.next();
				System.out.println("�����˺�");
				ussser.ID = input.nextInt();
				System.out.println("��������");
				ussser.password = input.nextInt();
				System.out.println("�����Ա�");
				ussser.sex = input.next();
				System.out.println("��������");
				ussser.age = input.nextInt();
				System.out.println("�������");
				ussser.money = input.nextInt();
				for(int w = 0; w<=100; w++) {
					if (sql[w] == null) {
						sql[w] = ussser;
						break;
					}
				}
				System.out.println("����");
				break;
			case 2:
				System.out.println("��½���������˺ź�");
				int IID = input.nextInt();
				System.out.println("��������");
				int pwd = input.nextInt();
				for(int i1 = 0; i1 <= 100; i1++) {
					if (sql[i1].ID == IID || sql[i1].password == pwd) {
						System.out.println("�����ֵܣ����½��");
						System.out.println(Arrays.toString(sql));
						break;
					}
				}
				break;
			case 3:
				System.out.println("��ѯ���ֵ�");
				System.out.println("1.ȫ����ѯ��2.����������ѯ");
				int e = input.nextInt();
				switch (e) {
				case 1:
					for(int s = 0; s<=100; s++) {
						if (sql[s] != null) {
							sql[s].shit();
						}else {
							break;
						}
					}
					break;
				case 2:
					System.out.println("������������Ҫ����=��=");
					break;
				}
			}
		}
	}
}
