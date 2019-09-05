package 集合框架_hashmap和set及迭代器;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class arrylist转set转it下标器 {
	//案例文件名为老师案例包中的//XianChenng.java
	public static void main(String[] args) {
		person p1 = new person("严尼玛",0);
		person p2 = new person("长尼玛",20);
		person p3 = new person("王尼玛",1000);
		
		//整个hashmap的集合,把东西塞进去
		HashMap<String, person> h = new HashMap<String, person>();
		h.put(p1.name, p1);
		h.put(p2.name, p2);
		h.put(p3.name, p3);
		
		String names = "王尼玛";
		
		//整个set的集合搞搞
		Set<String> set = h.keySet();
		for(String name : set) {
			if (name.equals(names)) {
				System.out.println(h.get(name).score);
			}
		}
		
		//整个Iterator迭代器搞一搞
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+"\t"+h.get(key).score);
		}
	}
}
