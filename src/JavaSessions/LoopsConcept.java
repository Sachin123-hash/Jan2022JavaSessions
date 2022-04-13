package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		//1.while loop
		//print 1 to 10
		
		int i=1;
		while(i<=10) {
			
			System.out.println(i);
			
			i++;
		}
System.out.println("***************");

int k =1;
while(k<=100) {
	System.out.println(k);
	if(k % 5==0) {
		System.out.println("Hiiii");
		break;
	}
	k++;
}

//use cases of while loop:
//1.You have to use while loop when number of iterations are not fixed
//2.Waiting for the element on the page
//3.Waiting foe the page to be loaded
//4.Pagination:1 2 3 4 5 6....11..20

System.out.println("********");

//while(true) {
//	System.out.println("Welcome to Hotel TAJ");
//}

//2.for loop
//print 1 to 10

for(int l=1;l<=10;l++) {
	
	System.out.println(l);
}


//print 10 to 1
for(int n=10;n>=1;n--) {
	System.out.println(n);
}

//ways to use for loop
System.out.println("***********");
int j =1;
 for(;j<=10;) {
	 
	 System.out.println(j);
	 j++;
 }


 //use case of for loop:
 //1.When number of iterations are fixed.
 //2.Drop down traversing.
 //3.Menu items of the page.
 //4.Calendar handling

System.out.println("do while");
 //3.do- while loop
 
 int p=1;
 do {
	 p++;     // if we increment here value will be 1 to 11
	 System.out.println(p);  // because in do while at least one statement will be print
	 //p++;        // if we increment here value will be 1 to 10
 }while(p<=10);




	}

}
