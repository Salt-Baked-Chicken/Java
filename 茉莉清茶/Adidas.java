package �������;

import java.util.Scanner;

public class Adidas {
	public static void main(String[] args) {
		System.out.println("fuck");
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
			System.out.println("������������");
			ex.printStackTrace();
		}finally {
			System.out.println("��ӭ�������");
		}
    }
}
