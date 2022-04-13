package ConstructorConcept;

public class Emp {
	String name;
	int age;
	String city;
	double sal;
	boolean isPrem;
	
	public void getSalary (String empName) {
		//buss logic
	}
	
	//constr....will help us to desging object

	public Emp(String name) {
		
		this.name = name;
	}

	


	public Emp(String name, int age, String city, double sal, boolean isPrem) {
		
		this.name = name;
		this.age = age;
		this.city = city;
		this.sal = sal;
		this.isPrem = isPrem;
	}
	



	public Emp(String name, String city, double sal, boolean isPrem) {
		
		this.name = name;
		this.city = city;
		this.sal = sal;
		this.isPrem = isPrem;
	}



	public static void main(String[] args) {
		
		
		Emp e = new Emp("tom");
		System.out.println(e.name);
		Emp e1= new Emp("tom", "Bang", 12.33, true);
		System.out.println(e1.name+""+e1.city+""+e1.sal+""+e1.isPrem);
		Emp e2= new Emp("Lisya", 24, "LA", 12.33, true);
		System.out.println(e2.name+""+e2.age+""+e2.city+""+e2.sal+""+e2.isPrem);
		
		
		

	}

}
