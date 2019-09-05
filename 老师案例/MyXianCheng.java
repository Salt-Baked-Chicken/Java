package ÀÏÊ¦°¸Àı;

import java.util.Vector;

public class MyXianCheng extends Thread {
	static Vector list =new Vector();
	@Override
	public void run() {
		String string="123";
		for (int i = 0; i < 10000; i++) {
			list.add(string);	
		}
 	}
}
