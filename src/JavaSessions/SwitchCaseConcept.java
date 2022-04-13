package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
	
		String browser ="chRomE        ";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "IE":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("Pass crct browser");
			break;
		}
		
		//for this condtion if should be used
		short marks =100;
		switch (marks) {
		case 90:
			System.out.println("Grade A++");
			
			break;
		case 80:
			System.out.println("Grade A");
			
			break;
		case 70:
			System.out.println("Grade B++");
			
			break;
		case 60:
			System.out.println("Grade B");
			
			break;

		default:
			System.out.println("Fail");
			break;
		}
		
		//Environment selection
		
		String env="preprod";
		
		switch (env) {
		case "QA":
			System.out.println("QA env");
			
			break;
		case "dev":
			System.out.println("dev env");
			
			break;
		case "Stagging":
			System.out.println("Stagging env");
			
			break;
		case "PROD":
			System.out.println("PROD env");
			
			break;

		default:
			System.out.println("select proper env");
			break;
		}
		
		System.out.println("************");
		String role="admin";
		
		switch (role) {
		
		case "superadmin":
			if(role.equals("superadmin")) {
				System.out.println("Open template page");
				
				}else {
					System.out.println("Go for PROD admin");
				}
			
			break;
		case "admin":
			if(role.equals("admin")) {
				System.out.println("Open project page");
				
				}else {
					System.out.println("Go for Techincian admin");
				}
			
			break;
			
		case" Techincian":
			if(role.equals(" Techincian")) {
				System.out.println("Open DSR");
				
				}else {
					System.out.println("IF no admin found go for defautl role");
				}

		default:
			System.out.println("Go for admin role");
			break;
		}
		
		
		
		
	System.out.println("***********");	
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		String role ="admin";
//		
//		switch (role) {
//		case "superadmin":
//System.out.println("superamin");
//			
//			break;
//		case "admin":
//			System.out.println("admin");
//						
//						break;
//
//		default:
//			System.out.println("superamin");
//			break;
//		}
		
		
		//bad code
		short marks1 =100;
		switch (marks1) {
		case 1:
			if(marks1==100) {
				System.out.println("B");
			}else {
				System.out.println("fail");
			}
			
			break;
		case 2:
			if(marks1>=95) {
				System.out.println("A");
				
			}else {
				System.out.println("fail");
			}
			
			break;
		case 3:
			if(marks1==100) {
				System.out.println("A++");
			}else {
				System.out.println("fail");
			}
			
			break;
		
		default:
			System.out.println("Fail");
			break;
		}
		
		
		String role1 = "admin";
		switch (role1) {
		case "superadmin":
			if(role1.equals("superadmin")) {
				System.out.println("superadmin");
			}else {
				System.out.println("look for admin role");
			}
			break;
		case "admin":
			if(role1.equals("admin")) {
				System.out.println("admin");
			}else {
				System.out.println("look for admin role");
			}
			break;
		case "techinian":
			if(role1.equals("techinian")) {
				System.out.println("cust");
			}else {
				System.out.println("look for admin role");
			}
			break;
default:
			System.out.println("look for crct role");
			break;
		}
		
		
		
	}


}
