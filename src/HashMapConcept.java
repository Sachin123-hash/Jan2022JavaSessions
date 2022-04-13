import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		//<key,value>--store value in this format -- pair/segement
		//HashMap class--default avavible class in java-- implements map(interface)
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Sachin", 100);
		map.put("Tom", 85);
		map.put("Sandeep", 90);
		map.put("John", 80);
		map.put(null, 60);
		map.put(null, 50);
		map.put("Naveen", null);
		map.put("Hary", null);
		map.put("Sachin", 00);
		map.put(null, null);
		
		map.put("Sachin", 100);
		map.put("Sachin", 100);
		map.put("Sachin", 100);
		map.put("Sachin", 100);


		
		System.out.println(map.get("Sachin"));
		System.out.println(map.get(null));
		System.out.println(map.get("Naveen"));
		System.out.println(map.get("Hary"));
		
		//how to iterate HashMap
		
		map.forEach((k,v) -> System.out.println(k + ":"+v));
		
		System.out.println("*******************");
		
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		mp.put(1, 100);
		mp.put(11, 100);
		mp.put(111, 100);
		mp.put(2, 100);
		mp.put(22, 100);
		
		mp.forEach((k,v) -> System.out.println(k + ":" + v));

		
		
		
		
		
		
		
	}

}
