package �����۲�;

public class T2 extends Thread {
	public void run() {
		synchronized (this) {
			young y = new young();
			y.climb();
		}
	}
}
