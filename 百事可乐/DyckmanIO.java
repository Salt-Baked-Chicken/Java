package ���¿���;

import java.io.File;

public class DyckmanIO {
	//IO����ѧϰ
	public static void main(String args[]) {
		File shit = new File("D:/JavaIO/text.txt");
		System.out.println(shit.exists());
		//�ж�Ŀ¼�ļ��Ƿ����;
		System.out.println(shit.isFile());
		//�ж��Ƿ��Ǹ��ļ�
		System.out.println(shit.isDirectory());
		//�ж��Ƿ���Ŀ¼//�ļ���
		System.out.println(shit.getPath());
		//���ش˶�����ļ����·����
		System.out.println(shit.getAbsolutePath());
		//���ؾ���·��
		System.out.println(shit.getName());
		//�����ļ���Ŀ¼��
		System.out.println(shit.delete());
		//ɾ��������,����ֵΪboolean
		System.out.println(shit.exists());
		//emmm���ж�һ�� 
		System.out.println(shit.length());
		//�����ļ�����
	}
}
