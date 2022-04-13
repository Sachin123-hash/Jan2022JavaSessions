package JavaSessions;

public class Customer {
	//non static methods,class var:data members of the class
			//function are not created inside function
			//function are parallel to each other
			//functions are always indepedent to each other
			
			
			//return type: void: can not return any value
			//default fun: 0 param
	
			//1.no input no return
	
	public void test(){
		System.out.println("test method");
		int a =10;
		System.out.println(a+20);
	}
	
	public void start() {
		System.out.println("Start Engine");
	}
	
	//2.no input and some return
	//return type: int
	public int getMarks() {
		System.out.println("get marks method");
		int a=10;
		int b=20;
		int c=90;
		int total =a+b+c;
		return total;
		
	}
	//return stype string
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name="Sachin";
		return name;
		
	}
	
	//3.some input and some return
	
	public int add(int a, int b) {  // int a and b are parameters
		System.out.println("add method");
		int sum = a+b;
		return sum;
		
		
	}
	//WAF
	//getStundetMarks
	//input param:name(String)
	//return marks(int)
	
	public int getStudentMarks(String name) {
		System.out.println("getting student marks for:"+name);
		
		int marks=-1;
		
		
		if(name.equalsIgnoreCase("Muneeb")){
			marks=90;
			
			
		}else if(name.equalsIgnoreCase("Ravish")) {
			marks= 95;
			
		}else if(name.equalsIgnoreCase("ANU")) {
			marks= 90;
			
		}else if(name.equalsIgnoreCase("Naveen")) {
		marks= 10;
	}else {
		System.out.println("please pass the right name:"+name);
		 
	}
		return marks;
		}
	
	
	
	public static void main(String[] args) {
		
		Customer obj = new Customer();
		obj.test();
		obj.start();
		//obj.getMarks();
		int t=obj.getMarks();
		System.out.println(t);
		System.out.println(t+50);
		
		String s=obj.getTrainerName();
		System.out.println("The trainer name is:"+s);
		
		int m=obj.add(10, 20); // 10 and 20 arguments
		System.out.println("Sum of a and b is:"+m);
		
		int m1=obj.getStudentMarks("anu");
		System.out.println(m1);
		if(m1==-1) {
			System.out.println("Wrong student...");
		}
		
		int m2=obj.getStudentMarks("TOM");
		if(m2==-1) {
			System.out.println("Wrong student...");
		}
		
		
		
		
		

	}

}
