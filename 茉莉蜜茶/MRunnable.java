package 茉莉蜜茶;

public class MRunnable implements Runnable{
	//implements实现Runnable接口
	public void run() {
		for(int i = 1;i < 6;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			//编写方法，用于输出线程名和步骤;
		}
	}
	public static void main(String args[]) throws InterruptedException {
		MRunnable mr = new MRunnable();
		//创建Runnable接口的对象mr//此接口实现的引用声明
		Thread myThread = new Thread(mr);
		//在mr对象中，创建线程对象myThread
		//※线程调度方法
		myThread.start();
		//走你
		myThread.setPriority(1);
		//更改线程优先级(1-10)默认5
		myThread.sleep(1000);
		//进程休眠1000=1s
		myThread.yield();
		//暂停该线程，执行其他线程，该线程转为就绪状态
		//不一定会礼让，提供一种可能
		myThread.interrupt();
		//中断该线程//与sleep()区别未知
		myThread.join();
		//线程强制运行
		System.out.println(myThread.isAlive());
		//检测线程是否为活动状态，返回值bool
	}
}
