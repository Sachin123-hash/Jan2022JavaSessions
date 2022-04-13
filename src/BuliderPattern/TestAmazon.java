package BuliderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		EcommApp obj = new EcommApp();
		obj.login("Sachin","sachin@123").search("iphone").addToCart("iphone").doPayment("121", 200).logout();
		

	}

}
