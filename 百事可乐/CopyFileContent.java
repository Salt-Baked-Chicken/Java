package 百事可乐;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author 严尼玛//10086
 * @version 1.0
 */
public class CopyFileContent {
	public static void main(String args[]) throws FileNotFoundException {
		try {
			FileInputStream aFile = new FileInputStream("D:/JavaIO/e.txt");
			//创建输入流input对象aFile
			FileOutputStream bFile = new FileOutputStream("D:/JavaIO/f.txt");
			//创建输出output流对象bFile
			byte space [] = new byte[1024];
			while((aFile.read(space)) != -1) {
				aFile.read();//读取
				bFile.write(space,0,space.length);//写入
				System.out.println("1");
				//假装确认打印了
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
