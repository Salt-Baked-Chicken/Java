package �����۲�;

public class MRunnable implements Runnable{
	//implementsʵ��Runnable�ӿ�
	public void run() {
		for(int i = 1;i < 6;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			//��д��������������߳����Ͳ���;
		}
	}
	public static void main(String args[]) throws InterruptedException {
		MRunnable mr = new MRunnable();
		//����Runnable�ӿڵĶ���mr//�˽ӿ�ʵ�ֵ���������
		Thread myThread = new Thread(mr);
		//��mr�����У������̶߳���myThread
		//���̵߳��ȷ���
		myThread.start();
		//����
		myThread.setPriority(1);
		//�����߳����ȼ�(1-10)Ĭ��5
		myThread.sleep(1000);
		//��������1000=1s
		myThread.yield();
		//��ͣ���̣߳�ִ�������̣߳����߳�תΪ����״̬
		//��һ�������ã��ṩһ�ֿ���
		myThread.interrupt();
		//�жϸ��߳�//��sleep()����δ֪
		myThread.join();
		//�߳�ǿ������
		System.out.println(myThread.isAlive());
		//����߳��Ƿ�Ϊ�״̬������ֵbool
	}
}
