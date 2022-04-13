package OOP_Encapsulation;

public class Browser {
	
	
	
	
	public void launchBrowser() {
		System.out.println("launching Browser");
		checkRam();
		checkOSCompatible();
		checkBrowserVersion();
		checkBrowserUpdate();
		System.out.println("browser is launched");
	}

	
	private void checkRam() {
		System.out.println("Checking ram");
	}
	
	private void checkOSCompatible() {
		System.out.println(" checkOSCompatible");
	}
	private void checkBrowserVersion() {
		System.out.println(" checkBrowserVersion");
	}
	private void checkBrowserUpdate() {
		System.out.println(" checkBrowserUpdate");
	}
}
