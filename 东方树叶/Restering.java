package 东方树叶;

import java.util.Scanner;

public class Restering {
	public static void main(String[] args) {
		String email = null;
		int pasword = 0,password = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 1; i>0; i++) {
		System.out.println("Hello,fuckyou,welcome.输入1注册，2登陆，3删除账号，4修改密码.");
		int switchnum = input.nextInt();
			switch (switchnum) {
			case 1:
				System.out.println("注册账号，请输入邮箱");
				email = input.next();
				System.out.println("账号么的问题，请输入密码，由数字组成");
				pasword = input.nextInt();
				System.out.println("注册成功");
				break;
			case 2:
				System.out.println("登陆账号请输入账号");
				String login = input.next();
					if (email == null) {
							System.out.println("你还没注册咧，先返回，注册后再登陆");
						}else {
							System.out.println("似乎有这个账号，输入密码吧,密码由数字组成噢");
							password = input.nextInt();
							if (password == pasword) {
								System.out.println("密码正确，恭喜登陆成果噢");
								break;
							}else{
								System.out.println("密码错误！返回重新来咯~");
								break;
							}
						}
				break;
			case 3:
				System.out.println("注销你刚注册的账号？？输入1确认注销");
				int shit = input.nextInt();
					if(shit == 1) {
					email = null;
					pasword = 0;
					System.out.println("注销成功");
					break;
				}
			case 4:
				System.out.println("修改密码(⊙o⊙)？输入你想改的密码呗~（要输入数字）");
				int pasword1 = input.nextInt();
				if (pasword1 == pasword) {
					System.out.println("操你妈，逗我玩？？");
					break;
				}else {
					pasword = pasword1;
					System.out.println("修改成功~");
					break;
				}
			}
		}
	}
}
