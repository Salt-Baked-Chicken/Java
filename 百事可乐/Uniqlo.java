package ���¿���;

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
		dog.add(1, "things");//������
		//things������bug���������б�1����"bug"Ӧ���ڵ�λ�ã�
		//bug�������˵�"2"λ��;
		dog.add("qwe");
		System.out.println(dog.size());
		//���鳤��;
		System.out.println("��"+dog.get(0));
		System.out.println("1"+dog.get(1));
		System.out.println(dog.get(2));
		//��������bug����1�����˵ڶ�λ;
		System.out.println("3"+dog.get(3));
		dog.remove(1);
		//λ��1�Ķ���things��Ĩȥ�ˣ�����bug�ص���ԭ����λ��
		//ArrayList�෽�����ڵ�������
		//���鳤�ȺͶ���λ�ÿ��Ա�Ĩȥ�ͼ��ߣ�����ǿ�滻
		System.out.println(dog);
		System.out.println(dog.contains("bug"));
		//��ⵯ���������Ƿ���ĳ�����󣬷���ֵΪ����ֵ;
		LinkedList dogs = new LinkedList();
		dogs.addFirst("fuc");
		dogs.addLast("shit");
		dogs.add("kb");
		//kb����Ϊshitʹ��addlast�����������ڵڶ���
		//kbΪ���һ��
		System.out.println(dogs);
		System.out.println(dogs.getLast());
		Set setn = new HashSet();
		String s1 = new String("shit");
		//ʹ��string()������s1����ֵ��
		setn.add(s1);
		System.out.println(s1);
		System.out.println("shit".equals(s1));
		//����:<id>ͬid����ֱ�Ӳ���
		//������int/Double�����Ͷ����ֱ������
		//ͨ������������ǿ������ת��;
	}
}

