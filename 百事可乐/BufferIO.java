package 百事可乐;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.xml.soap.Text;

public class BufferIO {
	public static void main(String args[]) throws IOException {
		Reader KENT = new FileReader("D:/JavaIO/Text.txt");
		//建立Reader对象
		BufferedReader ss = new BufferedReader(KENT);
		//建立BufferReader对象
		//BufferR是Reader的子类，带有缓冲区
		System.out.println(ss.readLine());
		//使用readLine方法,此方法独属于BufferR
		//方法是按行读取，此方法输出所读取的第一行
		System.out.println(ss.readLine());
		//输出第二行内容
		FileWriter ab = new FileWriter("D:/JavaIO/Text.txt");
		ab.write("fuc u allllllllllllllllll!!!");
		//写入这段内容，这会覆盖之前文件已有的内容
		//BufferedWriter是Writer的子类，带有缓冲区;
		ab.flush();
		//刷新缓冲区
		ss.close();
		KENT.close();
		//关闭:)
		//DateOutputStream属于FileOutputStream的子类
		//此类区别于File类在于，图片复制，file对内容复制;
	}
}
