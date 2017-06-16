package TempletMethod_1;

public class Client {

	/**
	 * 可以使逻辑处理通用化
	 * 使用Template Method模式优点在于父类的模板方法中编写了算法 因此无需在每个子类中在编写算法

	 * 父类与子类之间是亲密合作的
	 * 在Template Method模式中 父类和子类是紧密联系的 工作工作的 因此在子类中实现父类中的声明的抽象方法时 必须要理解这些抽象方法被调用的时机 在看不到父类的源代码的情况下 想要编写出子类的是非常困难的

	 * 父类与子类的一致性
	 * 使用功夫类类型的变量保存子类实例的优点是 几十没有用instanceof等制定子类的种类 程勋也能正常工作
	 */
	public static void main(String[] args) {
		AbstractDispaly d1 = new CharDisplay('H');
		AbstractDispaly d2 = new StringDisplay("Hello,World");
		AbstractDispaly d3 = new StringDisplay("你好 世界");
		d1.display();
		d2.display();
		d3.display();
	}

}
