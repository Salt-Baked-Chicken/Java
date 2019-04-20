package 百事可乐;

import java.io.File;

public class DyckmanIO {
	//IO操作学习
	public static void main(String args[]) {
		File shit = new File("D:/JavaIO/text.txt");
		System.out.println(shit.exists());
		//判断目录文件是否存在;
		System.out.println(shit.isFile());
		//判断是否是个文件
		System.out.println(shit.isDirectory());
		//判断是否是目录//文件夹
		System.out.println(shit.getPath());
		//返回此对象的文件相对路径名
		System.out.println(shit.getAbsolutePath());
		//返回绝对路径
		System.out.println(shit.getName());
		//返回文件或目录名
		System.out.println(shit.delete());
		//删除这孙子,返回值为boolean
		System.out.println(shit.exists());
		//emmm再判断一次 
		System.out.println(shit.length());
		//返回文件长度
	}
}
