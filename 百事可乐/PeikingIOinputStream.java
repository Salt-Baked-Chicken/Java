package ���¿���;

import java.io.File;
import java.io.FileInputStream;

public class PeikingIOinputStream {
	public static void main(String args[]) {
		File a = new File("D:/JavaIO/e.txt");
		try {
			boolean bo = a.createNewFile();
			FileInputStream s = new FileInputStream(a);
			System.out.println(s.available());
			//available�����ļ�������[�ֽ�]����
			System.out.println(s.read());
			//�����׸������ڱ�������ڵ�λ�ñ��
			byte[] b = new byte[4];
			//�趨�������ʱ��b�����������Ĵ�С
			//�������Ĵ�С���������read����
			//����ʱ������ȡ������[������]��С
			//����������У�����read���ȡb�����������鳤��
			//Ҳ�����ĸ��ֽڴ�С������
			System.out.println(s.read(b));
			//����ֵ4�ֽ�
			String content = new String(b);
			System.out.println(content);
			//�����JavaĬ�ϱ������ļ�����ⲻͬ
			//���ݻ����룬���b�����������ȳ�����������
			//String���Ĭ���ã��������ַ���������;
			s.close();
			//�ر�IO������;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
