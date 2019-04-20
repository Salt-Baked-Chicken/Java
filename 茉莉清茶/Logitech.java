package 茉莉清茶;

import java.util.Arrays;

public class Logitech {
	public static void main(String args[]) {
		int[] a= {5,35,205,87,19};
		int b=30;
		Arrays.sort(a);
		System.out.println("a数组长"+a.length);
		int[] c=new int[a.length+1];
		System.out.println("c+1数组长"+c.length);
			for(int i=0;i<a.length;i++) {
				c[i] = a[i];
			}
			for(int i=c.length-2;i>=0;i--) {
				if(b>c[i]) {
					c[i+1]=b;
					break;
				}else {
					c[i+1]=c[i];
				}
			}
		System.out.println(Arrays.toString(c));
	}
}