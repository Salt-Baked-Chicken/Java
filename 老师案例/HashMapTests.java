package ��ʦ����;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTests {
	public static void main(String[] args) {
		Persion p1=new Persion("�ź�",102);
		Persion p2=new Persion("�Ŷ���",90);
		Persion p3=new Persion("��С��",6);
		HashMap<String,Persion> h=new HashMap<String,Persion>();
		h.put(p1.name, p1);
		h.put(p2.name, p2);
		h.put(p3.name, p3);
		System.out.println(h.get("�ź�").score);
		String names= "��С��";
		//ʹ�ó���for����map�е�ĳ������
		/*��Ϊmap���Ǽ�ֵ�ԣ�ͨ������ֵ
		����Ҫ�Ȱ����еļ��ó������жԱ�*/
		/*map���и��ܹ������м�ȡ���ķ�����keySet������
		�������ķ���ֵ��һ��set����
		����ʹ��set���͵Ķ������*/
		Set<String> set=h.keySet();
		//ʹ�ó���for����set���ϣ��鿴key
		for (String name : set) {
			if(name.equals(names)) {
				//ʹ��key��ȡ��value
				System.out.println(h.get(name).score);
			}
		}
		
		
		Set<String> keys=h.keySet();    //ȡ������key�ļ���
		Iterator<String> it=keys.iterator();       //��ȡIterator����
		while(it.hasNext()){
			String key=it.next();      //ȡ��key
			System.out.println(key+"\t"+h.get(key).score);
		}
	}
}
