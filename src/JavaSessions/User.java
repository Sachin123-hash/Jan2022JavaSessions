package JavaSessions;

public class User {
	
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name="Tom";
		u1.age=20;
		u1.city="Bangalore";
		
		
		
		User u2 = new User();
		u2.name="John";
		u2.age=20;
		u2.city="Bangalore";
		
		
		
		
		User u3 = new User();
		u3.name="ABC";
		u3.age=30;
		u3.city="Bangalore";
		
		
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		
		System.out.println("******************");
		
		u1=u2;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		
		System.out.println("******************");
		
		u2=u3;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
	
        System.out.println("******************");
		
		u3=u1;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
	
		

	}

}
