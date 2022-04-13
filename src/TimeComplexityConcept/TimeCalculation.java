package TimeComplexityConcept;

public class TimeCalculation {

	public static void main(String[] args) {

		
		//TC---->Big O(n)
		
		int i =1;
		System.out.println(i);
		
		
		//O(1)
		
		for(int p =1; p<=10; p++) {
			System.out.println(p);
			
		}//10secs--->0.001
		//1 +n +n+n==>1+3n==>3n+1==>3n==>O(n)
		
		//2 for loops:
		
		for(int m=1;m<=10;m++) {
			for(int n =1;n<=10;n++) {
				System.out.println(m+":"+n);
			}
		}
	}
	
}
