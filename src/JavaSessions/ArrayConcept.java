package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Limitations of array:
		//Size is fixed: static array: to overcome this, we need to use dynamic array(ArrayList)
		//Stores only similar types of data: we can use Object array(static)
		
		
		
		//1.int array
		int i[]= new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[5]=50; //java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(i[3]);
		
		int li=0;
		int len =i.length;
		int hi=len-1;
		System.out.println(li);
		System.out.println(len);
		System.out.println(hi);
		System.out.println("*****************");
		
		//System.out.println(i[5]);  //java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(1[-1);   //java.lang.ArrayIndexOutOfBoundsException
		
		//how to fecth the values from array : for loop
		for(int l=0;l<4;l++) {
			System.out.println(i[l]);
			
		}
		
		System.out.println("**FOR LOOP**");
		//for each
		
		for(int e : i) {
			System.out.println(e);
		}
		System.out.println("**FOR EACH**");
		
		
		//double
		
		double[] d = new double[2];
		d[0]=12.33;
		d[1]=23.33;
		System.out.println(d[1]);
		System.out.println(d[1]+d[0]);
		
		//char
		
		char[] c = new char[5];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		c[4]='e';
		
		
		System.out.println(c.length);
		System.out.println(c.length-1);
		
		//example
		int a[]=new int[10];
		a[5]=50;
		System.out.println(a[1]);
       System.out.println("**STRING**");
		//String
		String[] s = new String[3];
		s[0]="Java";
		s[1]="Python";
		s[2]="JS";
		
		System.out.println(s[0]);
		System.out.println(s.length);
		
		for(String e:s) {
			System.out.println(e);
		}
		System.out.println("REVRSE");
		
		for(int p=s.length-1;p>=0;p--) {
			System.out.println(s[p]);
		}
		
		for(char b='a';b<='z';b++) {
			
			//System.out.println(b);//to print a to z
			System.out.println((int)b);// to print ascii value of a to z
			
		
		}
		//example to print string,int,double,boolean,char values
		//use object Array:it is a static array
		
		Object emp[]=new Object[5];
		emp[0]="TOM";
		emp[1]=30;
		emp[2]=23.333;
		emp[3]=true;
		emp[4]='M';
		System.out.println(emp[1]);
		
		System.out.println("FOR EACH");
		
		for (Object e:emp) {
			System.out.println(e);
		}
		
		System.out.println("FOR ");
		
		for(int m=0;m<=emp.length-1;m++) {
			System.out.println(emp[m]);
		}
		System.out.println("Revrse order FOR ");
		
		for(int z=emp.length-1;z>=0;z--) {
			System.out.println(emp[z]);
		}
	}

}
