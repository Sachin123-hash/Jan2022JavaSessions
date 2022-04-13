package JavaSessions;

import java.util.Arrays;

public class DataConversion {

	public static void main(String[] args) {
		
		//String to Int

		String x ="100";
		System.out.println(x+20);   //10020
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);   //120
		
		//String to double
		
		String y = "12.33";
		System.out.println(y+20);  //12.3320
		
		double d =Double.parseDouble(y);
		System.out.println(d+20);    //32.33
		
		String p ="AA100";
		System.out.println(p+20);  //AA10020
		
	
	
		System.out.println(p.indexOf(p));
		
//		char c =p.charAt(1);
//		System.out.println(c+20);
		
		//System.out.println(p.charAt(1));
		
		System.out.println("***********");
		
		String[] p1= p.split("AA");
		System.out.println(Arrays.toString(p1)+20);
		
		
		
		
		//int j =Integer.parseInt(p);
		
		//System.out.println(j+20);  //NumberFormatException
		
		
		System.out.println(Byte.MAX_VALUE);  //127
		System.out.println(Byte.MIN_VALUE);  //-128
		
		
		System.out.println(Integer.MAX_VALUE);   //2147483647
		System.out.println(Integer.MIN_VALUE);   //-2147483648
		
		
		//int to string
		
		int t =100;
		System.out.println(t+20); //120
		
		String s=String.valueOf(t);
		
		System.out.println(s+20);  //10020
		
		boolean flag= true;
		String ss = String.valueOf(flag); //true
		
		if(ss.equals("true")) {
			System.out.println("hii");
		}
		
		
		
//
//		boolean flag = true;
////		String s = String.valueOf(flag);//"true"
////		if(s.equals("true")) {
////			System.out.println("hii");
////		}
//		
		
		//escape
		
		String mesg="Welcome to \"Java\" class";
		System.out.println(mesg);
		
		
		
		
		
	}

}
