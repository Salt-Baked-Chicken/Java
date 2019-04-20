package 百事可乐;

import java.io.File;
import java.io.FileInputStream;

public class PeikingIOinputStream {
	public static void main(String args[]) {
		File a = new File("D:/JavaIO/e.txt");
		try {
			boolean bo = a.createNewFile();
			FileInputStream s = new FileInputStream(a);
			System.out.println(s.available());
			//available返回文件内数据[字节]长度
			System.out.println(s.read());
			//返回首个数据在编码库所在的位置编号
			byte[] b = new byte[4];
			//设定下面输出时，b参数缓冲区的大小
			//缓冲区的大小决定着这次read方法
			//调用时，所读取的内容[缓冲区]大小
			//在这个例子中，下面read会读取b缓冲区的数组长度
			//也就是四个字节大小的内容
			System.out.println(s.read(b));
			//返回值4字节
			String content = new String(b);
			System.out.println(content);
			//输出的Java默认编码库和文件编码库不同
			//内容会乱码，如果b数组所给长度超过已有内容
			//String类会默认用？■这种字符填满它♂;
			s.close();
			//关闭IO数据流;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
