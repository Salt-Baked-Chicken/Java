package Ͷ������;

import java.util.Scanner;

public class Allin {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int Philip = 100;
		int moeny = 1000;
		int hold = 0;
		int share = 0;
		System.out.println("philip���йɼ�"+Philip);
		System.out.println("ͨ���������ﵽ10000��Ǯ");
		System.out.println("���Ǯ"+moeny);
		Scanner input = new Scanner(System.in);
		for(int i = 0; i >= 0; i++) {
			if (hold<100 && i>100) {
				System.out.println("�㱬�����ֵ�");
			}
			int r = (int)(Math.random()*50);
			int nowphilp = r + Philip;
			System.out.println("phlip���ڹɼ�"+nowphilp);
			System.out.println("1.��2.����3.ˢ��//ȷ��ͨ��");
			int q = input.nextInt();
			if (moeny>10000 && hold>=0) {
				System.out.println("��ϲͨ��");
				System.out.println("ÿ֧��Ʊ�����Լ����ص㣬�ɿڿ���ϲ����������һ��㣬ż������µ���");
				int s = input.nextInt();
			}
			switch (q) {
			case 1:
				System.out.println("���򼸷ݣ�");
				share = input.nextInt();
				moeny = moeny - nowphilp*share;
				hold = hold + share;
				System.out.println("ʣ����"+moeny+"Ǯ!");
				System.out.println("����"+hold+"��philp��Ʊ");
				break;
			case 2:
				System.out.println("�������ݣ�");
				share = input.nextInt();
				moeny = moeny + nowphilp*share;
				hold = hold - share;
				System.out.println("��������"+moeny+"Ǯ!");
				System.out.println("����"+hold+"��philp��Ʊ");
				break;
			}
		}
	}

}
