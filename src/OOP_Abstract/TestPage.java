package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		
		HomePage hp = new HomePage(10);
		hp.title();
		hp.url();
		hp.timeOut();
		hp.logo();
		
		System.out.println("************");
		
		LoginPage lp = new LoginPage();
		
		lp.timeOut();
		lp.title();
		lp.url();
		lp.doLogin();
		
		
		
		//Page p = new Page();// cannot create the object for abstract class
		
		System.out.println("***********");
		
		//top casting
		Page p = new LoginPage();
		
		p.timeOut();
		p.title();
		p.url();
		p.logo();
		
		
		
		
		
		
	}

}
