package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
	int a = 20;
	int b = 30;
	

	if(a>b) { //false
		System.out.println("a is grt than b");
	}
	else {
		System.out.println("b is grt than a");
	}

	if(a==b) { //false
		System.out.println("both are eq");
		}
	else {
		System.out.println("not eq");
	}
	
	if(true) {
		System.out.println("Hi..");
		
	}
	
	else { //dead code
		System.out.println("bye..");
	}
	
	boolean flag = false;
	if(flag) {
		System.out.println("testing");
	}
	else {
		System.out.println("dev..");
	}
	
	int marks = 100;
	if (marks >= 90) {
		if (marks >= 95) {
			System.out.println("GRADE A++");
		} else {
			System.out.println("GRADE A");
		}
	} else {
		System.out.println("GRADE B");
	}
	
	//WAP:three different numbers
	//find out the max number
	
	int x = 100;
	int y = 200;
	int z = 300;
	 
	if(x>y && y>z) { // false && false = false
		System.out.println("X is greatest");
	}
	else if(y>z) {// false
		System.out.println("Y is greatest");
	}
	else {
		System.out.println("Z is greatest");
	}
	
	int c= 100;
	int d= 200;
	int e =300;
	int f =400;
	
	if(c>d && c>e && c>f) {
		System.out.println("c is greatest");
	}
	else if(d>e && d>f) {
		System.out.println("d is greatest");
	}
	else if(e>f) {
		System.out.println("e is greatest");
	}
	else {
		System.out.println("f is greatest");
	}
	
	float a1 = 12.33f;
	float b1 = 23.33f;
	
	if(a1>b1) {
		System.out.println("a is grt");
	}
	else {
		System.out.println("b is grt");
	}
	
	double d1=900.111111111111;
	double d2=500.222222;
	double d3=800.55555;
	
	if(d1>d2 && d1>d3) {
		System.out.println("d1 is grtst");
	}
	else if(d2>d3) {
		System.out.println("d2 is grtst");
	}
	else {
		System.out.println("d3 is grtst");
	}
	
	//only multiple IFs:
//	String browser1 ="chrome";
//	if(browser1.equals("chrome")) {
//		System.out.println("launch chrome");
//	}
//	if(browser1.equals("safari")) {
//		System.out.println("launch safari");
//		
//	}if(browser1.equals("ie")) {
//		System.out.println("launch ie");
//	}else {
//		System.out.println("pass crct");
//	}
	
	
	//if-else if
	String browser = "safari";
	switch (browser) {
	case "chrome":
		if(browser.equals("chrome")) {
			
			System.out.println("launch chrome");
			}else {
				System.out.println("pass crct");
			}
		break;

	case "safari":
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("pass crct");
		}
		break;
		default:
			System.out.println("pass crct");
			break;
	}
	
//	if(browser.equals("chrome")) {
//		
//		System.out.println("launch chrome");
//		}
//	else if(browser.equals("firefox")) {
//		System.out.println("launch firefox");
//	}else if(browser.equals("ie")) {
//		System.out.println("launch ie");
//	}else {
//		System.out.println("pass crct browser");
//	}
	}

}
