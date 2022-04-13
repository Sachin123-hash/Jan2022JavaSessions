package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		
		
		//1.byte:
		//range:-128 to 127
		//size: 1byte = 8bits
		byte b = 10;
		b=30;
		byte b1 =20;
		//byte b2 =200; //crosses the size limit
		
		System.out.println(b);
		System.out.println(b+b1);
		
		
		//2.short
		//range:-32768 to 32767
		//size: 2byte = 16bits.
		
		short s = 1000;
		short s1 = 2000;
		System.out.println(s+s1);
		
		//3.int
		//range: -2147483648 to 214783647
		//size: 4 byte = 32bits
		
		int i =10000;
		//example
		int totalBill =1222222;
		System.out.println(i);
		System.out.println(totalBill);
		
		//4.long
		//range:
		//size: 8bytes = 64bits
		
		long l =122222222222l;
		System.out.println(l);
		
		//example 
		long population = 711111111111l;
		
		System.out.println(population);
		
		//5.float:
		//size: 4bytes = 32bits
		//range: after point, it can take up to 7 digits.
		float f =12.33f;
		System.out.println(f);
		
		//6.double
		//size: 8bytes = 64bits
		//range: after point, it can take up to 15 digits.
		
		double d =12.3330987654321123456789009876;
		double d1 =100; //o/p will be 100.0
		
		
		//example: any scientific or medical values
		
		System.out.println(d);
		System.out.println(d1);
		
		//char: single digit value
		//char should be written in single quote

		
		
		
		char c='2';
		char c1='a';
		char c2='b';
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		//example
		
		char gender ='f';
		char flag ='Y';
		System.out.println(gender);
		System.out.println(flag);
		
		//7.boolean
		//size: approx 1bit
		boolean bo = true;
		boolean bo1 = false;
		System.out.println(bo);
		System.out.println(bo1);
		
		
		byte t =065;
		System.out.println(t);
		

		//065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
	}
	}
		
		
		

	


