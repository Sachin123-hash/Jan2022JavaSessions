package OOP_Abstract;

public class LoginPage  extends Page{

	@Override
	public void title() {
		System.out.println("Lp---title");
	}

	@Override
	public void url() {
		System.out.println("Lp---URL");
	}

	@Override
	public void timeOut() {
		System.out.println("page time out is 5 sec");
	}
	
    public void doLogin() {
    	System.out.println("APP login");
    }
    
    
    
}
