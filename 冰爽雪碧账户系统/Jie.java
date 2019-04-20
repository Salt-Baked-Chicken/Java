package 冰爽雪碧账户系统;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 * @auther 严尼玛
 * @版本 1.21.0
 */
public class Jie {
	public void Jone() {
		Ussser[] sql = new Ussser[10];//数组
		Scanner input = new Scanner(System.in);
		for(int i = 0; i >= 0; i++) {
			Ussser ussser = new Ussser();
			System.out.println("fucu,welcome,1.注册，2.登陆，3，查询");
			int q = input.nextInt();
			switch (q) {
			case 1:
				System.out.println("注册噢，输入姓名");
				ussser.name = input.next();
				System.out.println("输入账号");
				ussser.ID = input.nextInt();
				System.out.println("输入密码");
				ussser.password = input.nextInt();
				System.out.println("输入性别");
				ussser.sex = input.next();
				System.out.println("输入年龄");
				ussser.age = input.nextInt();
				System.out.println("输入余额");
				ussser.money = input.nextInt();
				for(int w = 0; w<=100; w++) {
					if (sql[w] == null) {
						sql[w] = ussser;
						break;
					}
				}
				System.out.println("成了");
				break;
			case 2:
				System.out.println("登陆啊，输入账号号");
				int IID = input.nextInt();
				System.out.println("输入密码");
				int pwd = input.nextInt();
				for(int i1 = 0; i1 <= 100; i1++) {
					if (sql[i1].ID == IID || sql[i1].password == pwd) {
						System.out.println("成啦兄弟，你登陆啦");
						System.out.println(Arrays.toString(sql));
						break;
					}
				}
				break;
			case 3:
				System.out.println("查询啊兄弟");
				System.out.println("1.全部查询，2.根据姓名查询");
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
					System.out.println("这种垃圾需求还要看？=。=");
					break;
				}
			}
		}
	}
}
