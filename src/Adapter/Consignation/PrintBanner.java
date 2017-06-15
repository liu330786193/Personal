package Adapter.Consignation;

public class PrintBanner implements Print {
	private Banner banner;

	public PrintBanner(String string){
		this.banner = new Banner(string);
	}


	@Override
	public void pringWeak() {
		banner.showWithParent();
	}

	@Override
	public void pringSong() {
		banner.showWithAster();
	}
}
