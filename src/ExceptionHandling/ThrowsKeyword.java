package ExceptionHandling;

import javax.naming.PartialResultException;

public class ThrowsKeyword {
	
	
	public void m1() {
		m2();
		

	}

	public void m2()  {
		m3();
		

	}

	public void m3() {
		try {
		m4();
		}catch(ArithmeticException e) {
			System.out.println("AE is coming..");
			e.printStackTrace();
		}

	}

	public void m4() throws ArithmeticException{
		
		int i =9/0;

	}

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("Bye");

		
	}

}
