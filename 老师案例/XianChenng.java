package ��ʦ����;

public class XianChenng {
	public static void main(String[] args) {
		//main�����������߳�
		/*Thread t= Thread.currentThread(); //��ȡ���߳�
		System.out.println("��ǰ�߳���: "+t.getName()); 
		t.setName("���߳�"); 
		System.out.println("��ǰ�߳�����: "+t.getName()); 
		*/
		MyXianCheng m1=new MyXianCheng();
		m1.setName("�߳�1");
		m1.start();
		MyXianCheng m2=new MyXianCheng();
		m2.start();
		MyXianCheng m3=new MyXianCheng();
		m3.start();
		MyXianCheng m4=new MyXianCheng();
		m4.start();
		MyXianCheng m5=new MyXianCheng();
		m5.start();
		System.out.println(MyXianCheng.list.size());
		//�̳�Thread��ʵ�ֶ��̱߳��
		//1.��д�߳��ಢ�̳�Thread��
		//2.��дrun�����������߳�Ҫ�����£�
		//3.�����̶߳��󣬵���start�������������߳�
		/*��ɽ��
		2����ͬʱ��
		������
		������
		500��
		run�������ÿ����100��
		���б��룬������������ȵ����������ȵ���*/
	}
}
