package ũ��ɽȪ;

import java.util.Scanner;

public class Cocacola {
	public static void main(String args[]) {
		//ˮ�ɻ���
			int i,x,y,z;
			for(i=100;i<1000;i++) {
				x=i%10;
				y=i/10%10;
				z=i/10/10%10;
				if(i==x*x*x+y*y*y+z*z*z) {
					System.out.println(i);
				}
			}
			
		//�����Сֵ
		System.out.println("�������ְɣ�");
		Scanner input = new Scanner(System.in);
		int q = input.nextInt();
		int max = q;
		int min = q;
			while(true) {
				if (q==0) {
					System.out.println("���������");
					break;
				}
				if(q>max) {max=q;}
				if(q<min) {min=q;}
				System.out.println("����������");
				q = input.nextInt();
			}
		System.out.println("���"+max+"��С"+min);
		
		//���ӳ���
		int t = 1;
		for(int day=1;day<10;day++) {
			t=(t+1)*2;
		}
		System.out.println("ժ��"+t+"��");
		
		//100�Ӽ����
		int o = 0;
		for(int p=1;p<=100;p++) {
			if (p/2 != 0) {
				o+=p;
			}else {
				o-=p;
			}
		}
		System.out.println(o);
	}
}















