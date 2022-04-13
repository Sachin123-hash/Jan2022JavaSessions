package OOP_Encapsulation;

public class User {
	
	private String firstname;
	private String lastname;
	private long phone;
	private boolean isPrime;
	//Encapsulation means hiding data
	public User(String firstname, String lastname, long phone, boolean isPrime) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.isPrime = isPrime;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
	public void getUserProfile() {
		System.out.println(firstname+" "+lastname+" "+phone+" "+isPrime);
	}
	
	
	
	
	

	
}
