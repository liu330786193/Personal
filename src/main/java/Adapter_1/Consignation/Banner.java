package Adapter_1.Consignation;

public class Banner {

	private String string;

	public Banner(String string){
		this.string = string;
	}
	public void showWithParent(){
		System.out.println("(" + string + ")");
	}

	public void showWithAster(){
		System.out.println("*" + string + "*");
	}

}
