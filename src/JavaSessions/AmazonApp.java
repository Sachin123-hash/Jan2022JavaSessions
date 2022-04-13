package JavaSessions;

public class AmazonApp {
	
	public boolean login() {//this is different method
		System.out.println("login is done");
		return true;
		
		}
public void login(String us,String pwd) { // all these are method overloading , all the signature should be same
		System.out.println("log");
	}
public void login(String us,String pwd,String role) {
	
}

public void login(String us,String pwd,String role,long ph,int otp) {
	
}

public void paynment() {
	
}
public void paynment(String cc) {
	
}
public void paynment(String cc,String cvc) {
	
}
	
	public static void main(String[] args) {
		AmazonApp ap= new AmazonApp();
		ap.login();
		ap.login("sac", "000");
		
	}

}
