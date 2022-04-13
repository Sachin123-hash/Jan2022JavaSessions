package AccessMod1;

import AccessModifier.Car;

public class Honda extends Car {

	public static void main(String[] args) {
		
		Honda h = new Honda();
		
		h.licNumber=1234567;
		h.name="Honda";
	
		System.out.println(h.licNumber);
		System.out.println(h.name);
		
		
		}

	}


