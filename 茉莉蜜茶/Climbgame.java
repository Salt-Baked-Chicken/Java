package �����۲�;

public class Climbgame {
	public static void main(String args[]) {
		//��old��young��������T1,T2�̣߳���run�������ж����ڵ�climb����
		//�������߳��������star���С�
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.setPriority(10);
		//������Сƨ�������ȼ�
		t1.start();
		t2.start();
		System.out.println();
	}
}
