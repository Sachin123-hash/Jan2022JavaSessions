package JavaSessions;

public class LoopsAssigment {

	public static void main(String[] args) {
		
		
		//Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		String s="Hello";
		String s1="Sachin";
		String s2="Selenium";
		char c='t';
		//Try to concat "Hello Selenium" with a character 't'.
		System.out.println(s+s2+c);
		
		 System.out.println(s);
		 System.out.println(s1);
		 
		 //Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
		//"Your Total amount is. 3700".
		 int a2=100;
		 int b2=200;
		 int c2=3400;
		 System.out.println("Your Total amount is:"+(a2+b2+c2));
		 
		 //Take three numbers from the user and print the greatest number. 
		 int a3=25;
		 int b3=78;
		 int c3=87;
		 
		 if(a3>b3&&b3>c3) {
			 System.out.println("The greatest:"+a3);
			 }else if(b3>c3) {
				 System.out.println("The greatest:"+b3);
				 
			 }else {
				 System.out.println("The greatest:"+c3);
			 }
		 //Write a Java program to test a number is positive or negative.
		 int a4=35;
		 int b4=-11;
		 if(a4>0) {
			 System.out.println("postive numbre:"+a4);
		 }
		 
		 else if(a4<0) {
			 System.out.println("negative number:"+a4);
			 
		 }else {
			 System.out.println("is neither positive nor negative");
		 }
		 
		 if(b4>0) {
			 System.out.println("postive numbre:"+a4);
		 }
		 
		 else if(b4<0) {
			 System.out.println("negative number:"+b4);
			 
		 }else {
			 System.out.println("is neither positive nor negative");
		 }
		 
		 
		 
		
		 
		
		
		//Write a Java program to print the sum of two numbers. 
		 int g=74;
		 int h=36;
		 System.out.println(g+h);
		 
		 //Write a Java program to divide two numbers and print on the screen. 
		 int a1=5;
		 int b1=15;
		 int c1=3;
		 int d1=2;
		 int e1=8;
		 
		 System.out.println(a1+b1/c1*d1-e1%c1);  //5 + 15 / 3 * 2 - 8 % 3 
		 //System.out.println(a1/b1);
		 
		//WAP using loop concept to print
			//I am a Batman
			//I am a Batman
			//I am a Batman
			//I am a Batman
			//I am a Batman
		 
         int a=1;
		
		while(a<=5) {
			System.out.println("I am a Batman");
			a++;
		}
		
		System.out.println("*****************");
		for(int i=0;i<10;i++) {
			System.out.println("I am a Batman");;
			
			}
		System.out.println("*******");
		
		int b=1;
		 do{
			 System.out.println("I am a Batman");
			 b++;
		 }while(b<=5);
		 
		 //WAP to print following output:
			// I am Batman 1 to I am Batman 9
		 System.out.println("***********");
		 int n=0;
		 while(n++<9) {
			 System.out.println("I am Batman"+ n);
			 }
		 //System.out.println(n);
			
			 
		 
		 //WAP to using loop concept to  print 10 to 1
		 for(int k=10;k>0;k--) {
			 System.out.println(k);
		 }
		 System.out.println("**********");
		 int d=10;
		 while(d>0) {
			 System.out.println(d);
			 d--;
		 }
		 System.out.println("**********");
		 int e=10;
		 do {
			 System.out.println(e);
			 e--;
		 }while(e>0);
		 System.out.println("***************");
		 //WAP to print "Hello World " 10 times using while loop
		 int l=1;
		 while(l<=10) {
			 System.out.println("Hello World");
			 l++;
		 }
		 //Write a program in Java to print 1 to 10 using while loop
		 System.out.println("***************");
		 int m=1;
		 while(m<=10) {
			 System.out.println(m);
			 m++;
		 }
		 //WAP to find out the max number from the given positive numbers
		 int y=10;
		 if(y%2==0) {
			 System.out.println("positive numbers");
			 
		 }else {
			 System.out.println("negtive number");
		 }
		 //Write a Java program to compute the specified expressions and print the output. Go to the editor
		 //Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		 double p=25.5;
		 double q=3.5;
		 double r=40.5;
		 double u=4.5;
		 
		 
		 System.out.println((p*q - q*q)/(r -u)); //(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		 
		 
		 //00 01 02 03 04
		 //10 11 12 13 14
		 //20 21 22 23 24
		 
		 System.out.println("*****************");
		 
		 for(int o=0; o<=4; o++) {
			 for(int x=0; x<=4; x++) {
				 
				 System.out.print(o+""+x+ " ");
			 }
			 System.out.println();
		 }
		 }
	
	
}
