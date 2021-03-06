package TempletMethod_1;

public class CharDisplay extends AbstractDispaly {

	private char ch;
	public CharDisplay(char ch){
		this.ch = ch;
	}

	@Override
	public void open() {
		System.out.println("<<");
	}

	@Override
	public void print() {
		System.out.println(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}
}
