package JavaSessions;

public class Browser {
	public boolean launchBrowser(String browserName) {
		System.out.println("launch name:"+browserName);
		// boolean flag=true;
		 
	switch (browserName.toLowerCase()) {
	case "chrome":
		System.out.println("launch chrome");
		return true;
		//return flag;
		
		//break;
	case "firefox":
		System.out.println("launch firefox");
		//return flag;
		return true;
	case "safari":
		System.out.println("launch safari");
		//return flag;
		return true;
	case "ie":
		System.out.println("launch ie");
		//return flag;
		return true;

	default:
		System.out.println("browser not found..."+browserName);
		
	}
		//return flag;
	return false;
	}

	public static void main(String[] args) {
		//WAF:will launch  the browser
		//input:browserName(String)
		//return:boolean(true/false)
		
		Browser b = new Browser();
		if(b.launchBrowser("chrome")) {
			System.out.println("enter url");
		}
		
		if(b.launchBrowser("tom")) {
			System.out.println("enter url");
		}else {
			System.out.println("tom not avavible");
		}
		
		

	}

}
