package ���¿���;

import java.io.File;
import java.io.FileInputStream;

public class NewyorkCreateIO {
	public static void main(String args[]) {
		File f = null;
		boolean boo = false;
		
		try {
			f = new File("D:/JavaIO/tat.txt");
			boo = f.createNewFile();
			//�жϲ������ļ���createNewFile��Ҫ����try��catch��
			System.out.println(boo);
			boo = f.delete();
			//�жϲ�ɾ��
			System.out.println(boo);
			//�����ӡ����ֵ
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
