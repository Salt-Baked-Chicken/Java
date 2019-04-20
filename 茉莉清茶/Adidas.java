package 茉莉清茶;

import java.util.Scanner;

public class Adidas {
	public static void main(String[] args) {
		System.out.println("fuck");
		Scanner in = new Scanner(System.in);
		try {
			int courseCode = in.nextInt();
			switch (courseCode) {
			case 1:
				System.out.println("C#编程");
				break;
			case 2:
				System.out.println("Java编程");
				break;
			case 3:
				System.out.println("SQL基础");
			}
		} catch (Exception ex) {
			System.out.println("不能输入数字");
			ex.printStackTrace();
		}finally {
			System.out.println("欢迎提出建议");
		}
    }
}
