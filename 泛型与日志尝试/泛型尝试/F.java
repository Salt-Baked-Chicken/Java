package ���ͳ���;

public class F<K> {
	//key�������������ΪT��T�������ɡ��ⲿ��ָ��
	private K key;
	
	//���췽��ʹ��K����������Ϊ����
	public F(K key) {
		this.key = key;
	}
	
	//���ͷ���-lastfunction-�ķ���ֵ����ΪK��K���������ⲿָ��
	public K getkey() {
		return key;
	}
	
	//���Ϸֱ��ǣ��������ͣ����͹��췽��������ֵ���ͷ���
	//���͵����Ͳ���ֻ������-���ͣ������ǻ���������(��int)
	//���潨�˸������ 
	public static void main(String[] args) {
		//�ڽ�����ʱ��ͨ���������ݵĲ�ͬ��������ͬ�������͹淶�ķ��͵Ķ���
		//רҵ�����������ʵ�Σ��������������<Integer> Integer��intȫƴ
		//����Է��������ͬ����_���ڶ�̬˼�롢
		
		F<Integer> fint = new F<Integer>(123);
		F<String> fstring = new F<String>("������ţ��");
		System.out.println(fint.getkey());
		System.out.println(fstring.getkey());
		
		//��һ��Ҫ���뷺�����ͣ�������Ĭ�Ͽ���Ϊ�κ�����(������չ��)
		//ֻ�з����뷺�ͼ���<T>&<R>�໥����
		F f = new F(111);
		System.out.println(f.getkey());
		fint.showkeyValue1(fint);//����������ķ���ͨ�������
	//�����Ƿ�����
	}
	
	//����ͨ�������֪���������ɶ�������ͣ��ͣ�
	//������F�࣬����ĳ�����巺�����͵ģ�obj����
	public void showkeyValue1(F<?> obj) {
		System.out.println("���Ͳ��� key value is"+obj.getkey());
	}
}
