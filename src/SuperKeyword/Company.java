package SuperKeyword;

public class Company implements Fund {
	
	int salary=100;
	
	public Company() {
		
		System.out.println("Comp---Constr");
	}
	public Company(int a ) {
		super(); //will call default class object
		System.out.println("Comp---Constr" +" "   +a);
	}
	
	public Company(int a,int b ) {
		
		System.out.println("Comp---Constr" +" "   +a + " "+b);
		
	}
	
	public Company(int a,int b,int c ) {
		
		System.out.println("Comp---Constr" +" "   +a + " "+b +" "+c);
		
	}
	
	
	
	public void cafe() {
		System.out.println("Comp----cafe");
		System.out.println(salary);
		
	}
	
	public final static void logo() {
		System.out.println("comp---logo");
	}

}
