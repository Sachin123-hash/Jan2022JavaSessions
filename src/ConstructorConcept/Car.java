package ConstructorConcept;

public class Car {
	
	String name;
	int price;
	String color;
	String model;
	static final int wheels=4;
	
	public Car(String name, int price, String color, String model, int wheels) {
		
		this.name = name;
		this.price = price;
		this.color = color;
		this.model = model;
		//this.wheels = wheels;
	}
	public Car(String name, int price, String color, String model) {
		
		this.name = name;
		this.price = price;
		this.color = color;
		this.model = model;
	}
	public Car(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	
	

}
