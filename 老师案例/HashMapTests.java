package 老师案例;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTests {
	public static void main(String[] args) {
		Persion p1=new Persion("张浩",102);
		Persion p2=new Persion("张二浩",90);
		Persion p3=new Persion("张小浩",6);
		HashMap<String,Persion> h=new HashMap<String,Persion>();
		h.put(p1.name, p1);
		h.put(p2.name, p2);
		h.put(p3.name, p3);
		System.out.println(h.get("张浩").score);
		String names= "张小浩";
		//使用超级for查找map中的某个对象
		/*因为map中是键值对，通过键找值
		所以要先把所有的键拿出来进行对比*/
		/*map中有个能够把所有键取出的方法（keySet（））
		但是他的返回值是一个set类型
		所以使用set类型的对象接收*/
		Set<String> set=h.keySet();
		//使用超级for遍历set集合，查看key
		for (String name : set) {
			if(name.equals(names)) {
				//使用key获取到value
				System.out.println(h.get(name).score);
			}
		}
		
		
		Set<String> keys=h.keySet();    //取出所有key的集合
		Iterator<String> it=keys.iterator();       //获取Iterator对象
		while(it.hasNext()){
			String key=it.next();      //取出key
			System.out.println(key+"\t"+h.get(key).score);
		}
	}
}
