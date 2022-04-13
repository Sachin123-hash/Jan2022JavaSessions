package ConstructorConcept;

public class TestCar {

	public static void main(String[] args) {
		Car c = new Car("Audi", 10);
		System.out.println(c.name+" "+c.price);
		Car c1 = new Car("baleeno", 10, "Blue", "delta");
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+c1.model);
		
		System.out.println(Car.wheels);
		
		
		//Person p = new Person();
		Person.getMail();
		
		
		
		

	}

}
