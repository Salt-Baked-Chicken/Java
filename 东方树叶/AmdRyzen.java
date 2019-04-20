package 东方树叶;

import java.util.Scanner;

import org.omg.CORBA.ARG_IN;

public class AmdRyzen {
	public static void main(String arg[]) {
		System.out.print("请输入课程代号(1～3之间的数字):");
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
			System.out.println("输入不为数字!");
			ex.printStackTrace();
		} finally {
			System.out.println("欢迎提出建议!");
		}
	}
}
