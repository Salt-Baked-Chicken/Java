package ���Ͽ��_hashmap��set��������;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class arrylistתsetתit�±��� {
	//�����ļ���Ϊ��ʦ�������е�//XianChenng.java
	public static void main(String[] args) {
		person p1 = new person("������",0);
		person p2 = new person("������",20);
		person p3 = new person("������",1000);
		
		//����hashmap�ļ���,�Ѷ�������ȥ
		HashMap<String, person> h = new HashMap<String, person>();
		h.put(p1.name, p1);
		h.put(p2.name, p2);
		h.put(p3.name, p3);
		
		String names = "������";
		
		//����set�ļ��ϸ��
		Set<String> set = h.keySet();
		for(String name : set) {
			if (name.equals(names)) {
				System.out.println(h.get(name).score);
			}
		}
		
		//����Iterator��������һ��
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+"\t"+h.get(key).score);
		}
	}
}
