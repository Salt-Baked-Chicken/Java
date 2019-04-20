package ‹‘¿Ú√€≤Ë;

public class T1 extends Thread {
	public void run() {
		synchronized (this) {
			Old o = new Old();
			o.climb();
		}
	}
}
