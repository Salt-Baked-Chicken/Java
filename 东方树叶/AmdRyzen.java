package ������Ҷ;

import java.util.Scanner;

import org.omg.CORBA.ARG_IN;

public class AmdRyzen {
	public static void main(String arg[]) {
		System.out.print("������γ̴���(1��3֮�������):");
		Scanner in = new Scanner(System.in);
		try {
			int courseCode = in.nextInt();
			switch (courseCode) {
			case 1:
				System.out.println("C#���");
				break;
			case 2:
				System.out.println("Java���");
				break;
			case 3:
				System.out.println("SQL����");
			}
		} catch (Exception ex) {
			System.out.println("���벻Ϊ����!");
			ex.printStackTrace();
		} finally {
			System.out.println("��ӭ�������!");
		}
	}
}
