package 农夫山泉;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class Nike {
	public static void main(String arg[]) {
			int c= 0;
			int level = 1;
			String[] bag = new String[10];
			String[] wegot = {"严尼玛的牛仔外套","好戏开场的军甲","史丹利快报",
					"原谅手套","Ironman的手套","原力鞋","王疏桐的AJ",
					"记忆的钟瑜军靴","原谅帽","刘馨龙的王冠"};
			Scanner input1 = new Scanner(System.in);
			System.out.println("输入你的姓名");
			String name = input1.next();
			System.out.println("1.走你");
			System.out.println("2.退出");
			int a = input1.nextInt();
			for (int i = 0;i>-1;i++) {
					switch (a) {
					case 1:
						System.out.println("开始了");
						System.out.println("打怪了");
							int b = (int)(Math.random()*6);
							c=c+b;
							if (c>=10) {
								c=c-10;
								level++;
							}
							int r = (int)(Math.random()*10);
							if (r==1||r==5||r==7) {
								System.out.println("掉落装备了！");
								for(int q=0;q<=10;q++) {
									if (bag[q]==null) {
										int rr = (int)(Math.random()*10);
										System.out.println("你掉落了"+
												wegot[rr]+"装备！");
										bag[q]=wegot[rr];
										break;
									}
								}
							}
							System.out.println("1.打怪");
							System.out.println("2.查看");
							System.out.println("3.推出");
						a =input1.nextInt();
						break;
					case 2:
						System.out.println("查看游戏");
						System.out.println("经验值等于"+c);
						System.out.println("等级是"+level);
						System.out.println("名字是"+name);
						System.out.println("装备有"+Arrays.toString(bag));
						System.out.println("1.打怪");
						System.out.println("2.查看");
						System.out.println("3.推出");
						a =input1.nextInt();
						break;
					case 3:
						System.out.println("退出游戏");
						System.exit(0);
						break;
					}
			}
	}
}
