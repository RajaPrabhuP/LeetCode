package java8;

public class Browser implements Chrome, Firefox{

	@Override
	public void launch() {
		System.out.println("LaunchBrowser");	

		System.out.println("Hard reset...");

		System.out.println("Updating Browser..");

	}
	
	@Override
	public void quit() {
		Chrome.super.quit();
		Firefox.super.quit();
		System.out.println("Browser also decided...");
		System.out.println("Browser also decided...");
		
	}

	public static void main(String[] args) {
		new Browser().launch();
		new Browser().quit();
		Chrome.maximize();
		Firefox.maximize();
	}

}
