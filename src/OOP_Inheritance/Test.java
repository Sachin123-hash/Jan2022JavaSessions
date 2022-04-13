package OOP_Inheritance;

public class Test {

	public static void main(String[] args) {
		BMW b= new BMW();
		b.start(); //overriden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoparking();//individual
		
		b.engine();
		
		
		BMW.speed();
		Car.speed();
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//child class object can be referred by parent class ref variable
		//top casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoParking();//ref type check  cannot access this mthod
		
		//down casting
		//BMW b1 = (BMW)new Car();//down casting
		//b1.start();
		
		Vehicle v = new Vehicle();
		v.engine();
		
		Vehicle v1 = new BMW();
		v1.engine();
		
		Vehicle v2 = new Car();
		v2.engine();
		
		Audi a= new Audi();
		a.engine();
		a.theftSaftey();
		
		Vehicle v3 = new Audi();
		v3.engine();
		
		
		
		
		

	}

}
