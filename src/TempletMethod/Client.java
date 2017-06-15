package TempletMethod;

public class Client {

	public static void main(String[] args) {
		AbstractDispaly d1 = new CharDisplay('H');
		AbstractDispaly d2 = new StringDisplay("Hello,World");
		AbstractDispaly d3 = new StringDisplay("你好 世界");
		d1.display();
		d2.display();
		d3.display();
	}

}
