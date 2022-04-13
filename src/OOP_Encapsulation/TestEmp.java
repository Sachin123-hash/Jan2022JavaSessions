package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name="Tom";
		e1.age=30;
		e1.setSalary(12.33);
		double sal=e1.getSalary();
		System.out.println(sal);
		
		
		LoginPage lp = new LoginPage();
		//post
		lp.setUsername("Sachin");
		lp.setPassword("Sachin@123");
		
		//GET
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		//PUT
		lp.setPassword("sach@12");
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		
		LoginPage lp1 = new LoginPage();
		lp1.doLogin(lp1.getUsername(), lp1.getPassword());  //null

	}

}
