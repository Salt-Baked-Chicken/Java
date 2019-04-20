package 茉莉蜜茶;

public class Climbgame {
	public static void main(String args[]) {
		//将old，young对象引入T1,T2线程，用run方法运行对象内的climb方法
		//将两个线程引入这里，star运行。
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.setPriority(10);
		//更改了小屁孩的优先级
		t1.start();
		t2.start();
		System.out.println();
	}
}
