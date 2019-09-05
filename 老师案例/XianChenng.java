package 老师案例;

public class XianChenng {
	public static void main(String[] args) {
		//main方法就是主线程
		/*Thread t= Thread.currentThread(); //获取主线程
		System.out.println("当前线程是: "+t.getName()); 
		t.setName("主线程"); 
		System.out.println("当前线程名是: "+t.getName()); 
		*/
		MyXianCheng m1=new MyXianCheng();
		m1.setName("线程1");
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
		//继承Thread类实现多线程编程
		//1.编写线程类并继承Thread类
		//2.重写run（）方法（线程要做的事）
		//3.创建线程对象，调用start（）方法启动线程
		/*爬山：
		2个人同时爬
		老年人
		年轻人
		500米
		run方法里边每次爬100米
		进行编码，看结果（老人先到，年轻人先到）*/
	}
}
