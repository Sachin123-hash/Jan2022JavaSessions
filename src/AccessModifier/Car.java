package AccessModifier;

public class Car {
	
	public String name;
	private int price;
	protected int licNumber;
	String color;
	

	public static void main(String[] args) {
		
		Car c = new Car();
		c.color="White";
		c.licNumber=1234;
		c.price=12;
		
		System.out.println(c.price);
		
		
		
		
		

	}

}
