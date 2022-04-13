package ExceptionHandling;



public class TryCatch {
	int age;
	

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		int a[]=new int [3];
		
		TryCatch obj = new TryCatch();
		obj = null;
		
		try {
		int i=9/3;  //ArithmeticException
		a[2]=10; //ArrayIndexOutOfBoundsException
		obj.age=10;   //NullPointerException
		
		
		System.out.println("hello");
		System.out.println("hello");
		}
//		
//		catch(Throwable e){
//			System.out.println("ArrayIndexOutOfBoundsException");
//			//System.out.println("ArithmeticException");
//			e.printStackTrace();
//			
//		}
catch(NullPointerException e){
	try {
	int i =9/0;
	}
	catch(ArithmeticException e1) {
		System.out.println("hello");
		
		e.printStackTrace();
	}
			
			System.out.println("NullPointerException");
			
			e.printStackTrace();
			
		}
		
		
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
			//System.out.println("ArithmeticException");
			e.printStackTrace();
			
		}
//		catch(Exception e){
//			//System.out.println("ArrayIndexOutOfBoundsException");
//			//System.out.println("ArithmeticException");
//			System.out.println("some expection is coming");
//			e.printStackTrace();
//			
//		}
		catch(ArithmeticException e){
			
			System.out.println("ArithmeticException");
			
			e.printStackTrace();
			
		}
		
catch(Exception e){
			
			System.out.println("some Exception");
			
			e.printStackTrace();
			
		}
		
		
		
		System.out.println("Bye");
	}

}
