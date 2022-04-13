package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		
		System.out.println("a");
		
		try {
			int i =9/3;
		}
			
//		}catch(Exception e) {
//			System.out.println("Some exception is coming...");
//			e.printStackTrace();
//		}
		
		finally {
			System.out.println("Inside finally block");
		}
	}
}

