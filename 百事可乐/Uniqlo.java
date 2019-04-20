package 百事可乐;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Uniqlo {
	public static void main(String args[]){
		List dog = new ArrayList();
		dog.add("shitdog");
		dog.add("bug");
		dog.add(1, "things");//在这里
		//things顶替了bug处于数组列表1本身"bug"应该在的位置，
		//bug被挤到了第"2"位。;
		dog.add("qwe");
		System.out.println(dog.size());
		//数组长度;
		System.out.println("有"+dog.get(0));
		System.out.println("1"+dog.get(1));
		System.out.println(dog.get(2));
		//输入结果，bug被从1顶到了第二位;
		System.out.println("3"+dog.get(3));
		dog.remove(1);
		//位置1的对象things被抹去了，所以bug回到了原来的位置
		//ArrayList类方法属于弹性数组
		//数组长度和对象位置可以被抹去和挤走，不能强替换
		System.out.println(dog);
		System.out.println(dog.contains("bug"));
		//检测弹性数组中是否有某个对象，返回值为布尔值;
		LinkedList dogs = new LinkedList();
		dogs.addFirst("fuc");
		dogs.addLast("shit");
		dogs.add("kb");
		//kb不因为shit使用addlast方法而被挤在第二个
		//kb为最后一个
		System.out.println(dogs);
		System.out.println(dogs.getLast());
		Set setn = new HashSet();
		String s1 = new String("shit");
		//使用string()方法给s1对象赋值；
		setn.add(s1);
		System.out.println(s1);
		System.out.println("shit".equals(s1));
		//泛型:<id>同id可以直接操作
		//不会因int/Double等类型而出现编译错误
		//通过这样，不用强制类型转换;
	}
}

