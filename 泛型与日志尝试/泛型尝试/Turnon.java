package 泛型尝试;

/*	public class Turnon<T> implements faninterfave<T> {
 *		//实现泛型接口
 *		@Override
 *		public T next() {
 *			return null;
 *		}
 *	}
 *
 * 上面基础的实现了接口方法，但在实现接口的实现类中，如果传入的参数（实参）
 * 是某一种具体的基本类型，则所有使用实现泛型使用泛型名的地方
 * 都需要将泛型名称替换成实际传入参数的基本类型，以下为范例
*/

public class Turnon implements faninterfave<String> {
	//实现泛型接口
	@Override
	public String/*原本这里是泛型类*/ next() {
		return null;
	}
}
/*
 * 泛型的基础类型如<Integer>是Number的一个子类
 * 实际上基本是一种基本类型
 * 但在调用方法的传入参数当中，如果方法参数定义由泛型设计
 * 不同泛型类的传入（哪怕是基础类型泛型）会引起报错
 * 为此解决，诞生通配符，就是它→? 用来 表示未知可能参入的参数类型
 * 泛型方法为此独立开了一个内容……泛型方法
*/