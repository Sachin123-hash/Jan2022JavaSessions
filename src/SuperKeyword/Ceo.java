package SuperKeyword;

public class Ceo extends Company {
	
	int salary=300;
	
	public Ceo() {
		super(10,20,30);
		System.out.println("CEO---const");
	}
	
	@Override
	public void cafe() {
		System.out.println("CEO----cafe");
		System.out.println(salary);
		System.out.println(super.salary);
		
	}
	
	public static void main (String[] args) {
		Ceo c = new Ceo();
		c.cafe();
		c.logo();
		
	}
	

}
