package JavaSessions;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "is this is my java code";
		System.out.println(s.length()); //20
		//charAt
		System.out.println(s.charAt(0)); //t
		
		//System.out.println(s.charAt(20));//StringIndexOutOfBoundsException
		
		System.out.println(s.charAt(19)); //e
		
		//System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException
		
		//indexOf
		System.out.println(s.indexOf("t")); //0
		
		System.out.println(s.indexOf("java")); //11
		
		System.out.println(s.indexOf("i")); //2
		
		System.out.println(s.indexOf('i',s.indexOf('i')+1)); //5
		
		System.out.println(s.indexOf('i',s.indexOf('i')+1));// need to find
		
		String msg="welcome admin";
		if(msg.indexOf("admin")>0) {
			System.out.println("correct msg");
		}
		
		
		//trim
		String s1="      hello selenium           ";
		System.out.println(s1.trim());
		
		//replace
		String s2="hello testing";
		System.out.println(s2.replace(" ", ""));//hellotesting
		
		String s3="                       hello selenium          ";
		System.out.println(s3.trim().replace(" ", ""));//helloselenium
		
		String str="this selenium code";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		
		//equals
		
		String t1= "hello google";
		String t2= "hello Google";
		String t3= "hello google";
		
		System.out.println(t1.equals(t2));//false
		System.out.println(t1.equalsIgnoreCase(t2));//true
		System.out.println(t1==t3);//true
		
		
		//contains();
		
		String m ="welcome to testing";
		if(m.contains("welcome")) {
			System.out.println("this is correct");
		}
		
		//substring
		
		String p ="this is my testing code";
		System.out.println(p.substring(3));//s is my testing code
		System.out.println(p.substring(0, 10));//this is my
		
		String m1 = "your order id is 12345";
		System.out.println(m1.substring(m1.indexOf("is")+3,m1.length()));
		
		String st = new String("hello");
		String st1 = "hello";
		System.out.println(st==st1);//false
		System.out.println(st.equals(st1));//true
		
		
		//split:
		
		String pop="xXJavaxXXPythonXxXTestingXXxSelenium";
		String[] top=pop.split("xX");
		
		System.out.println(top[0]);
		System.out.println(top[1]);
		System.out.println(top[2]);
		System.out.println(top[3]);
		//System.out.println(top[4]);//ArrayIndexOutOfBoundsException
		
		
		String empData="tom;peter;30;LA;USA;90909090";
		String emp[]=empData.split(";");
		
//		for(String e:emp) {
//			System.out.println(e);
//		}
		
		System.out.println(Arrays.toString(emp));
		
		String pl="hello testing java";
		
//		System.out.println(pl.split(" ")[0]);
//		System.out.println(pl.split(" ")[1]);
//		System.out.println(pl.split(" ")[2]);
		
		System.out.println(pl.split(" "));
		System.out.println(Arrays.toString(pl.split(" ")));
		
		
		System.out.println("***********");
		
		String mh = "hello this is my iphone";
		
		System.out.println(mh.indexOf('i'));


		System.out.println(mh.indexOf('i',mh.indexOf('i')+1));
		
		System.out.println(mh.indexOf('i', (mh.indexOf('i',mh.indexOf('i')+1)+1)));
		
		
		//System.out.println(mh.indexOf('i', ((mh.indexOf('i',mh.indexOf('i')+1)+1)+)));
		
		
		
		
		


	}

}
