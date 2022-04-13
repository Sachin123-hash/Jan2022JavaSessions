package ConstructorConcept;

public class Employee{
	
	String name;
	int age;
	double salary;
	String city;
	boolean isPerm;
	
	
	
	//Constructor of the class
			//name will be same as the class name
			//Constructor is not a function.
			//it cannot return anything..... no return type
			//overloading is possible
			//Constructor will be called automatically when we create the object of the class
			//but function will be called when we create the object of the class and use object refrence variable.
			
			public Employee(){
				System.out.println("Default constr..");
			}
			
			
			public Employee(int a){
				System.out.println("1 constr.."+a);
			}
			public Employee(int a , int b){
				System.out.println("2 constr.."+(a+b));
			}


	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(10, 20);
		 
		
		}
		
		

	}


