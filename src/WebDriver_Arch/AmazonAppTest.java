package WebDriver_Arch;

public class AmazonAppTest {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		//chrome
		
//		ChromeDriver driver = new ChromeDriver();
//		
//		driver.getTitle();
//		driver.getUrl();
//		driver.findElement("email id");
//		driver.findElements("paswrd");
//		driver.click();
//		driver.quit();
		
		
		//firefox: // how to run cross browser  --so we use top casting
		
		//FireFoxDriver driver = new FireFoxDriver();
		//ChromeDriver driver = new ChromeDriver();
		//SafariDriver driver = new SafariDriver();
		
		//top casting
		
		
		String browser = "FireFox";

		if (browser.equals("Chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equals("FireFox")) {

			driver = new FireFoxDriver();

		} else if (browser.equals("Safari")) {

			driver = new SafariDriver();

		} else {

			System.out.println("pass the correct browser");
		}

		driver.getTitle();
		driver.getUrl();
		driver.findElement("email id");
		driver.findElements("paswrd");
		driver.click();
		driver.quit();
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
