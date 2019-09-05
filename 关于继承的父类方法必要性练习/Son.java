package 关于继承的父类方法必要性练习;

public class Son extends Dad {
	String shit;
	Dad dad = new Dad();
	@Override
	public void dad() {
		// TODO 自动生成的方法存根
		super.dad();
		//something
	}
	public static void main(String[] args) {
		System.out.println("shit");
		Dad dad = new Dad();
		dad.dad();
	}
}
