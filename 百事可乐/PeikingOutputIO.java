package ���¿���;

import java.io.File;
import java.io.FileOutputStream;

public class PeikingOutputIO {
	public static void main(String args[]) {
	try {
		FileOutputStream ttk = new FileOutputStream("D:/JavaIO/st.txt");
		String shht = "�Ժ�˯�ã�������Ҫ";
		byte[] elecc = shht.getBytes();
		System.out.println(shht.getBytes());
		//���建�������鳤�ȵ���shht�ַ�����?_x;
		//ʹ��ƽ̨��Ĭ���ַ������ַ�������Ϊ�������У���������洢��һ���µ��ֽ������С�
		//��shitÿ���ֽ���Ϊ�ֽڱ������洢��elecc���鵱��_��;
		ttk.write(elecc,0,elecc.length);
		//�ѳԺ�˯�ã�������Ҫд��ttk���·�����ļ���
		ttk.close();
		//�ټ�
		}catch (Exception e) {
			
		}
	}
}