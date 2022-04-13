package JavaSessions;

public class carType {
	
	String name;
	int price;
	String color;
	static final int wheels=4;//static variables also called instance variables 
	
	
	public static void start() {
		System.out.println("car start....");
		
	}
public  void stop() {
	System.out.println("car stop....");
		
	}
	

	public static void main(String[] args) {
		carType c1 = new carType();
		c1.name ="Honda";
		c1.price=10;
		c1.color="white";
		//c1.wheels=5;
		c1.stop();
		
		
		carType c2 = new carType();
		c2.name ="Audi";
		c2.price=10;
		c2.color="blue";
		//c2.wheels=4;
		
		carType c3 = new carType();
		c3.name ="BMW";
		c3.price=10;
		c3.color="black";
		//c3.wheels=4;
		
		//1.directly
		
		System.out.println(wheels);
		start();
		
		//2. by class name
		System.out.println(carType.wheels);
		//why main method is static in nature
		//if main is non static jvm should create object to call main method.
		
		
		
		

	}

}
