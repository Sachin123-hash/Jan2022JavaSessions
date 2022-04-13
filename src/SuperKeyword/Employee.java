package SuperKeyword;

public class Employee extends Company {
	
	int salary=200;
	
	
	
	
	public Employee() {//const chaining
		
		super(10);   //super keyword should be the first statement in child constructor
		System.out.println("Emp---Const");
		//super(10);  error
		
	}

	@Override
	
	public void cafe() {
		System.out.println("Emp--cafe");
		System.out.println(salary);
		System.out.println(super.salary);  // will access parent class varaible salary
		
		super.cafe(); //// will access parent class method
		
		super.logo();   //will access static and final method 
		
		}
	
	public static void main(String [] args) {
		Employee e = new Employee();
		
		e.cafe();
		
		Ceo c = new Ceo();
		c.cafe();
		c.logo();
		
		Manager m = new Manager();
		m.cafe();
		m.logo();
		
		
		
		
	}

}
