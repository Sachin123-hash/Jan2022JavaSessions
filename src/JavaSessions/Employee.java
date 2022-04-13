package JavaSessions;

public class Employee {
	
	//class vars:
	
	String name;
	int age;
	String city;
	double salary;
	char gender;
	boolean isActive;

	public static void main(String[] args) {
		
		//class-->blueprint/template/category
		//Object- a physical entity
		
		
		Employee e = new Employee();
		
		e.name="Tom";
		e.age=25;
		e.city="Bangalore";
		e.salary=12.33;
		e.gender='m';
		e.isActive=true;
		
		System.out.println(e.name+" "+e.age+" "+e.city);
		
Employee e1 = new Employee();
		
		e1.name="Sachin";
		e1.age=20;
		e1.city="Pune";
		e1.salary=12.33;
		e1.gender='m';
		e1.isActive=true;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city);
		
		
Employee e2 = new Employee();
		
		e2.name="Henry";
		e2.age=29;
		e2.city="LS";
		e2.salary=12.33;
		e2.gender='f';
		e2.isActive=true;
		
		System.out.println(e2.name+" "+e2.age+" "+e2.city);
		
		new Employee().name="Sachin";
		//no reference Object
		new Employee().isActive=true;
		
		System.gc();
		
		Employee e3 = new Employee();	
		e3.name="John";
		e3.age=29;
		e3.city="LS";
		e3.salary=12.33;
		e3.gender='f';
		e3.isActive=true;
		
		//e3=null;  // once it is assigned to null will get  //NullPointerException
		//System.out.println(e3.name);  //NullPointerException
		
		
		
		

	}

}
