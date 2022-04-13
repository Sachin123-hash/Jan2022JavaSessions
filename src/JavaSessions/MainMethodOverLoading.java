package JavaSessions;

public class MainMethodOverLoading {
	

	public static void main(int a) {
		System.out.println(a);
		
	}
public static void main(int a,int b) {
	System.out.println(a+b);
	}

	

public static void main(String[] args) {
	System.out.println("print main");
	main(10);
	MainMethodOverLoading.main(10, 20);
	}

}
