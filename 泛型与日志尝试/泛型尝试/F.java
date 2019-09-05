package 泛型尝试;

public class F<K> {
	//key这个变量的类型为T，T的类型由“外部”指定
	private K key;
	
	//构造方法使用K泛型类型作为参数
	public F(K key) {
		this.key = key;
	}
	
	//泛型方法-lastfunction-的返回值类型为K，K的类型由外部指定
	public K getkey() {
		return key;
	}
	
	//以上分别是：定义类型，泛型构造方法，返回值泛型方法
	//泛型的类型参数只能是类-类型，不能是基础简单类型(如int)
	//下面建了个对象↓ 
	public static void main(String[] args) {
		//在建对象时，通过传入数据的不同，来建不同基础类型规范的泛型的对象
		//专业点儿叫做泛型实参，比如下面的它→<Integer> Integer是int全拼
		//如此以方便调用相同函数_属于多态思想、
		
		F<Integer> fint = new F<Integer>(123);
		F<String> fstring = new F<String>("哈哈哈牛逼");
		System.out.println(fint.getkey());
		System.out.println(fstring.getkey());
		
		//不一定要传入泛型类型，不传入默认可以为任何类型(数据扩展性)
		//只有泛型与泛型间如<T>&<R>相互限制
		F f = new F(111);
		System.out.println(f.getkey());
		fint.showkeyValue1(fint);//调用了下面的泛型通配符方法
	//以上是泛型类
	}
	
	//泛型通配符，不知道传入的是啥玩意类型，就？
	//以下是F类，不着某个具体泛型类型的，obj对象
	public void showkeyValue1(F<?> obj) {
		System.out.println("泛型测试 key value is"+obj.getkey());
	}
}
