package ������Ҷ;

import java.util.Scanner;

public class Restering {
	public static void main(String[] args) {
		String email = null;
		int pasword = 0,password = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 1; i>0; i++) {
		System.out.println("Hello,fuckyou,welcome.����1ע�ᣬ2��½��3ɾ���˺ţ�4�޸�����.");
		int switchnum = input.nextInt();
			switch (switchnum) {
			case 1:
				System.out.println("ע���˺ţ�����������");
				email = input.next();
				System.out.println("�˺�ô�����⣬���������룬���������");
				pasword = input.nextInt();
				System.out.println("ע��ɹ�");
				break;
			case 2:
				System.out.println("��½�˺��������˺�");
				String login = input.next();
					if (email == null) {
							System.out.println("�㻹ûע���֣��ȷ��أ�ע����ٵ�½");
						}else {
							System.out.println("�ƺ�������˺ţ����������,���������������");
							password = input.nextInt();
							if (password == pasword) {
								System.out.println("������ȷ����ϲ��½�ɹ���");
								break;
							}else{
								System.out.println("������󣡷�����������~");
								break;
							}
						}
				break;
			case 3:
				System.out.println("ע�����ע����˺ţ�������1ȷ��ע��");
				int shit = input.nextInt();
					if(shit == 1) {
					email = null;
					pasword = 0;
					System.out.println("ע���ɹ�");
					break;
				}
			case 4:
				System.out.println("�޸�����(��o��)����������ĵ�������~��Ҫ�������֣�");
				int pasword1 = input.nextInt();
				if (pasword1 == pasword) {
					System.out.println("�����裬�����棿��");
					break;
				}else {
					pasword = pasword1;
					System.out.println("�޸ĳɹ�~");
					break;
				}
			}
		}
	}
}
