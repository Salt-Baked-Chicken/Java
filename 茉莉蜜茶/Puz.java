package �����۲�;

public class Puz extends Thread{
	//��дrun����
	public void run() {
		for(int i = 1; i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String args[]) {
		Puz thread = new Puz();
		thread.start();
		Puz t1 = new Puz();
		Puz t2 = new Puz();
		t1.start();
		t2.start();
		//���̷߳ǲ���ִ��
		//�߳�ÿ��ִ��ʱ����CPU�������
		//��������Ψһ��������ԣ�
	}
}
