package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList - default class avaible in Java
		//dynamic array
		//inintal virtual capcity is always 10 and physical capcity 0
		//order based/index based array
		//part of collections
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());  //0 Pyshical capcity =0
		
		ar.add(100);  //0
		ar.add(200);  //1
		
		System.out.println(ar.size());
		
		ar.add(300); //2
		ar.add(400); //3
		
		System.out.println(ar.size());
		
		ar.add(12.33);//4
		ar.add('h');//5
		ar.add(true);//6
		ar.add("testing");//7
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		
		//li=0
		//len=ar.size--->PC=8
		//hi=len-1-->8-1=7
		
		//System.out.println(ar.get(-1)); //IndexOutOfBoundsException
		//System.out.println(ar.get(8)); //IndexOutOfBoundsException
		
		//to get all values from array list..
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		for(Object e:ar) {
			System.out.println(e);
		}
		
		ArrayList ar1= new ArrayList(5);
		System.out.println(ar1.size());  //pc=0 and vc=5
		
		ar1.add(300);//0
		//System.out.println(ar1.get(3)); ////IndexOutOfBoundsException
		
		
		//generics:
		
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(200);
		marksList.add(300);
		//marksList.add("Hello");
		// marksList.add("HI");
		
		ArrayList<Object> empData = new ArrayList<Object>();
		
		empData.add("Tom");
		empData.add(30);
		empData.add('m');
		empData.add(true);
		empData.add(12.33);
		
		System.out.println(empData.get(0));
		
		ArrayList<String> namesList = new ArrayList<String>();
		
		 namesList.add("Tom");
		 namesList.add("Sachin");
		 
		 System.out.println(namesList.size());
		 System.out.println("******");
		 ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		 
		numbers.add(100); //0
		numbers.add(200);//1
		numbers.add(300);//2
		numbers.add(400);//3
//		System.out.println(numbers.get(2));//300
//		System.out.println(numbers.size());
//		
//		numbers.remove(2);
//		System.out.println(numbers.size());
//		System.out.println(numbers.get(2));//400
		
		//numbers.add(3, 100); //Cant go directly to 3rd position it should be come in order like 0 1 2 3//IndexOutOfBoundsException
		
		System.out.println(numbers.get(3));
		numbers.add(3,500);
		System.out.println(numbers.get(3));
		//In Array we can add value anywhere
		int i[]=new int[4];
		i[2]=10;
		System.out.println(i[2]);//10
		System.out.println(i[0]);//0 default value
		
		int j[]= {1,2,3,4,5};//static array literals
		
		
		System.out.println(j.length);
		j[0]=200;
		System.out.println(j[0]);
		
		
		
		
		
		
		
		
		
		

	}

}
