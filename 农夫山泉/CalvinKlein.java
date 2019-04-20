

package Å©·òÉ½Èª;

import java.util.Random;
import java.util.Scanner;

public class CalvinKlein {
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			Random random = new Random();
			int b = input.nextInt();
			int s = (int)(Math.random()*100+1);
			for(int i=0;i<9999999;i++){
				if (b>s) {
					System.out.println("smaller");
					b = input.nextInt();
					continue;
				}else if (b<s) {
					System.out.println("bigger");
					b = input.nextInt();
					continue;
				}else if (b==s) {
					System.out.println("yep");
					System.out.println(i);
					break;
				}
				continue;
			}
		}
	}