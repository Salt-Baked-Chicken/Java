import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        around();
    }

    public static void around(){
        System.out.println("你好，随机数输入测试，请在下一行输入该随机数");
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String sum = "";
        for (int i = 0; i < 9; i++){
            int b = r.nextInt(10);
            sum = sum+b;
        }
        System.out.println("随机数是: "+ sum);
        String testput = s.nextLine();
        if (testput.equals(sum)){
            System.out.println("随机数相符，测试成功\n");
            around();
        }else{
            System.out.println("你输入的数字是: "+ testput);
            System.out.println("输入错误，测试失败");
            exit(0);
        }
    }
}
