package ���¿���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author ������//10086
 * @version 1.0
 */
public class CopyFileContent {
	public static void main(String args[]) throws FileNotFoundException {
		try {
			FileInputStream aFile = new FileInputStream("D:/JavaIO/e.txt");
			//����������input����aFile
			FileOutputStream bFile = new FileOutputStream("D:/JavaIO/f.txt");
			//�������output������bFile
			byte space [] = new byte[1024];
			while((aFile.read(space)) != -1) {
				aFile.read();//��ȡ
				bFile.write(space,0,space.length);//д��
				System.out.println("1");
				//��װȷ�ϴ�ӡ��
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
