package ExceptionHandling;

public class Student {
	
	public static int getMarks(String name) {
		
		
		System.out.println("student name:"+ name);
		
		if(name.equals("Sandeep")) {
			try {
				int i =9/3;
				return 80;
				
			}catch(Exception e) {
				System.out.println("Some exception is coming");
				e.printStackTrace();
				return 70;
			}
			finally {
				System.out.println("Bye");
				
				//return 50;
				
				
			}
			
			
		}else if(name.equals("Roopa")) {
			return 70;
			
		}else if(name.equals("Sachin")) {
			return 10;
			
		}else {
			System.out.println("student is not present");
			return -1;
			
		}
		
		
	}

	public static void main(String[] args) {

		int m1=getMarks("Sandeep");
	
		System.out.println(m1);
		
		
		//Pracitall example
		
		//db connection -- pass 
				//pass sql string -- pass
				//try{
				//results from db -- exceptions // no exception
				//}
//				catch() {
//					some sql exception is coming
//				}
//				finally {
//					//close db connection
					//close excel / file / prop file / xml /json/ 
					//driver.quit
//				}
				//print the result from db
		
	}

}
