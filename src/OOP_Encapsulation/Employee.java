package OOP_Encapsulation;

public class Employee {

	public String name;
	public int age;
	private double salary;
	
	//getter and setter methods
	
	public void setSalary(double salary) {
		this.salary=salary;
		
		
	}
	public double getSalary() {
		return salary;
		
	}
	
	
	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.name="Tom";
		e1.age=20;
		e1.salary=34.55;
		
		System.out.println(e1.salary);
		
		
		

	}

}
