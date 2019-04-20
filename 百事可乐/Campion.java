package 百事可乐;

import java.util.Scanner;

public class Campion {
	public static void main(String args[]){
		String string = "我爱你中国,我爱你长城,大爱无疆";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的字符：");
        String input = scanner.next();
        String[] array = string.split(input);
        System.out.println(input + " 总共出现了：" + (array.length - 1) + "次");
    }
}
