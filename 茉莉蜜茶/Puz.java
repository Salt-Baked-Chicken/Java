package 茉莉蜜茶;

public class Puz extends Thread{
	//重写run方法
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
		//多线程非并行执行
		//线程每次执行时常由CPU分配决定
		//输出结果不唯一，由随机性？
	}
}
