package ũ��ɽȪ;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class Nike {
	public static void main(String arg[]) {
			int c= 0;
			int level = 1;
			String[] bag = new String[10];
			String[] wegot = {"�������ţ������","��Ϸ�����ľ���","ʷ�����챨",
					"ԭ������","Ironman������","ԭ��Ь","����ͩ��AJ",
					"�������褾�ѥ","ԭ��ñ","��ܰ��������"};
			Scanner input1 = new Scanner(System.in);
			System.out.println("�����������");
			String name = input1.next();
			System.out.println("1.����");
			System.out.println("2.�˳�");
			int a = input1.nextInt();
			for (int i = 0;i>-1;i++) {
					switch (a) {
					case 1:
						System.out.println("��ʼ��");
						System.out.println("�����");
							int b = (int)(Math.random()*6);
							c=c+b;
							if (c>=10) {
								c=c-10;
								level++;
							}
							int r = (int)(Math.random()*10);
							if (r==1||r==5||r==7) {
								System.out.println("����װ���ˣ�");
								for(int q=0;q<=10;q++) {
									if (bag[q]==null) {
										int rr = (int)(Math.random()*10);
										System.out.println("�������"+
												wegot[rr]+"װ����");
										bag[q]=wegot[rr];
										break;
									}
								}
							}
							System.out.println("1.���");
							System.out.println("2.�鿴");
							System.out.println("3.�Ƴ�");
						a =input1.nextInt();
						break;
					case 2:
						System.out.println("�鿴��Ϸ");
						System.out.println("����ֵ����"+c);
						System.out.println("�ȼ���"+level);
						System.out.println("������"+name);
						System.out.println("װ����"+Arrays.toString(bag));
						System.out.println("1.���");
						System.out.println("2.�鿴");
						System.out.println("3.�Ƴ�");
						a =input1.nextInt();
						break;
					case 3:
						System.out.println("�˳���Ϸ");
						System.exit(0);
						break;
					}
			}
	}
}
