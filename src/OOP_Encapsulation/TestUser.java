package OOP_Encapsulation;

public class TestUser {

	public static void main(String[] args) {
		User u1= new User("Kiran", "jadeja", 90900, true);
		
		System.out.println(u1.isPrime());
		System.out.println(u1.getPhone());
		
		//update
		u1.setPhone(808080);
		System.out.println(u1.getPhone());
		
		u1.setPrime(false);
		System.out.println(u1.isPrime());
		
		u1.getUserProfile();
		
		u1.setPrime(true);
		u1.getUserProfile();
		
		
		

	}

}
