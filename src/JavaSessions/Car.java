package JavaSessions;

import java.util.ArrayList;

public class Car {
	/**
	 * This method is used to book the car on the basis of given car type
	 * @param car(String)
	 * @return this will return ArrayList<String>
	 */
	
	public ArrayList<String> booking(String car) {
		System.out.println("car type:"+ car);
		ArrayList<String> carList = new ArrayList<String>();
		
		
		
		if(car.equals("sedan")) {
			carList.add("Honda");
			carList.add("Civic");
			carList.add("Tata Indigo");
		}
		else if(car.equals("SUV")) {
			carList.add("Range Rover");
			carList.add("XUV700");
		}
		else if(car.equals("Mini")) {
			carList.add("Cooper");
			carList.add("Swift");
			
			
		}else
		{
			System.out.println("Car type is not avaible...");
		}
		
		return carList;
	}
	//method overloading:Poly+Morphism--->compile time(static)
	//With in the same class, we have
	//1.different methods with same name.
	//2.different parameters
	//3.different sequence of parameter
	public void test() {//1 param
		System.out.println("test method");
		
	}
public void test(int a) {//2 param
	System.out.println("test method"+a);
		
	}
public void test(int a, int b) {
	System.out.println("test method"+ a+b);
	
}

public void test(int a, String b) {
	System.out.println("test method"+ a+b);
	
}
public void test(String a,int b) {
	System.out.println("test method"+ a+b);
	
}
	




	public static void main(String[] args) {
		 Car c = new Car();
		 
		 ArrayList<String> sedanList=c.booking("sedan");
		 System.out.println(sedanList);
		 
		 c.test();
		 c.test(10);
		 c.test(10, 20);
		 
		 

	}
	}
	

