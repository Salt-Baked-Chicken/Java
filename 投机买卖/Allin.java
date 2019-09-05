package 投机买卖;

import java.util.Scanner;

public class Allin {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int Philip = 100;
		int moeny = 1000;
		int hold = 0;
		int share = 0;
		System.out.println("philip发行股价"+Philip);
		System.out.println("通关条件：达到10000块钱");
		System.out.println("你的钱"+moeny);
		Scanner input = new Scanner(System.in);
		for(int i = 0; i >= 0; i++) {
			if (hold<100 && i>100) {
				System.out.println("你爆仓啦兄弟");
			}
			int r = (int)(Math.random()*50);
			int nowphilp = r + Philip;
			System.out.println("phlip现在股价"+nowphilp);
			System.out.println("1.买，2.卖，3.刷新//确认通关");
			int q = input.nextInt();
			if (moeny>10000 && hold>=0) {
				System.out.println("恭喜通关");
				System.out.println("每支股票都有自己的特点，可口可乐喜欢定期增长一点点，偶尔大幅下跌。");
				int s = input.nextInt();
			}
			switch (q) {
			case 1:
				System.out.println("想买几份？");
				share = input.nextInt();
				moeny = moeny - nowphilp*share;
				hold = hold + share;
				System.out.println("剩下了"+moeny+"钱!");
				System.out.println("持有"+hold+"份philp股票");
				break;
			case 2:
				System.out.println("想卖几份？");
				share = input.nextInt();
				moeny = moeny + nowphilp*share;
				hold = hold - share;
				System.out.println("你现在有"+moeny+"钱!");
				System.out.println("持有"+hold+"份philp股票");
				break;
			}
		}
	}

}
