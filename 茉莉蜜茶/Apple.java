package 茉莉蜜茶;

public class Apple {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		//currentThread为主线程对象
		System.out.println("当前线程是"+t.getName());
		t.setName("func");
		//设置一下名字=。=
		System.out.println("当前线程是"+t.getName());
	}

}
