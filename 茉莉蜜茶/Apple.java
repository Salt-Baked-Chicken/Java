package �����۲�;

public class Apple {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		//currentThreadΪ���̶߳���
		System.out.println("��ǰ�߳���"+t.getName());
		t.setName("func");
		//����һ������=��=
		System.out.println("��ǰ�߳���"+t.getName());
	}

}
