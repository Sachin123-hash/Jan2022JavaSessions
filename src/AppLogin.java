import java.util.HashMap;

public class AppLogin {

	public static void main(String[] args) {

		// Roles Base Access Control(RBAC): user roles
		// example: Ecomm website:customer,admin,seller,partner,vendor,distributor
		// amazon.com--login page
		//another ex: Product Meta Data--hashmap
		
		getCredentials("customer");
		getCredentials("vendor");
		//getCredentials("admin");
		
		//LinkedHashmap
		//TreeMap
		
		

	}

	public static void getCredentials(String role) {

		HashMap<String, String> credmap = new HashMap<String, String>();

		credmap.put("customer", "tom@gmail.com:tom@123");

		credmap.put("admin", "admin@gmail.com:admin@123");

		credmap.put("seller", "seller@gmail.com:seller@123");

		credmap.put("partner", "partner@gmail.com:partner@123");

		credmap.put("vender", "vender@gmail.com:vender@123");
		
		String credData=credmap.get(role);
		
		String userName=credData.split(":")[0];//tom@gmail.com:tom@123
		String password=credData.split(":")[1];
		
		doLogin(userName,password);
		
		
		
	}

	public static void doLogin(String userName, String password) {

		System.out.println("username is :" + userName);
		System.out.println("password is :" + password);

		System.out.println("login is done");

	}

}
