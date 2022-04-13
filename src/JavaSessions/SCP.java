package JavaSessions;

public class SCP {
	
	public static void main(String [] args) {
		
		//String literals
		
		String s1="java";
		String s2="java";
		String s3="java";
		
		System.out.println(s1==s2); //true
		s1="python";
		System.out.println(s1==s2); //false
		
		String s4 = new String("hello");//2
		String s5="hello";//0
		System.out.println(s4==s5); //false
		
		String s6 = new String("hello");//2
		
		
		System.out.println(s4==s6);//false
		
		String str="Hello world";
		str=str+"java"; //Hello worldjava
		System.out.println(str);
		
		String str1="Hello world";
		System.out.println(str1);
		
		int i =10;
		i=20;
		System.out.println(i);//20
	}

}
