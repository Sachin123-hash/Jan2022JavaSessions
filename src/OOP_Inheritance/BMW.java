package OOP_Inheritance;

public class BMW extends Car{

	
	//Method overriding:
	//When you have a method in parent class as well as in child class
	//with same name
	//and same number of parameters
	//and same return type
	
	@Override
	public void start() {
		System.out.println("BMW---start");
	}
	
	
	public void autoparking() {
		System.out.println("BMW---autoparking");
	}

	
	
	//method hiding
	public static void speed() {
		System.out.println("car----speed");
		
	}
	@Override
	public void engine() {
		System.out.println("BMW----engine");
	}
	
}
