package 百事可乐;

import java.io.File;
import java.io.FileInputStream;

public class NewyorkCreateIO {
	public static void main(String args[]) {
		File f = null;
		boolean boo = false;
		
		try {
			f = new File("D:/JavaIO/tat.txt");
			boo = f.createNewFile();
			//判断并创建文件，createNewFile需要放在try，catch里
			System.out.println(boo);
			boo = f.delete();
			//判断并删除
			System.out.println(boo);
			//输出打印返回值
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
