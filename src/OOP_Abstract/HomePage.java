package OOP_Abstract;

public class HomePage extends Page {
	
	
	
	//default consrt..
	
	public HomePage() {
		System.out.println("HP----const");
	}
	
	public HomePage(int a) {
		System.out.println("HP----const"+ " " + a);
	}
	
	

	@Override
	public void title() {
		System.out.println("HP-----home page title");
		
	}

	@Override
	public void url() {
		System.out.println("HP---home page URL");
		
	}
	
	
	

}
