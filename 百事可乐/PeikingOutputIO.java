package 百事可乐;

import java.io.File;
import java.io.FileOutputStream;

public class PeikingOutputIO {
	public static void main(String args[]) {
	try {
		FileOutputStream ttk = new FileOutputStream("D:/JavaIO/st.txt");
		String shht = "吃好睡好，开心重要";
		byte[] elecc = shht.getBytes();
		System.out.println(shht.getBytes());
		//定义缓冲区数组长度等于shht字符长度?_x;
		//使用平台的默认字符集将字符串编码为字序序列，并将结果存储到一个新的字节数组中。
		//把shit每个字节作为字节变量，存储在elecc数组当中_√;
		ttk.write(elecc,0,elecc.length);
		//把吃好睡好，开心重要写入ttk这个路径的文件内
		ttk.close();
		//再见
		}catch (Exception e) {
			
		}
	}
}