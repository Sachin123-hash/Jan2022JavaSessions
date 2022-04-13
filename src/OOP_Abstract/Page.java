package OOP_Abstract;

public abstract class Page {
	
	//contains both abstract method + non abstract methods.
	// cannot create the object for abstract class.
	//can create the constructor of abstract class
	//and this constructor ..will be called when you create object of child class
	
	//can have no abstract method--0% abstraction
	//can have only  abstract methods--100% abstraction
	//can have abstract methods + non abstract methods--partial abstraction
	
	public Page() {
		System.out.println("page consrt...");
	}
	
	
	public Page(int a) {
		System.out.println("page consrt..."+ a);
	}
	
	
	
	public abstract void title();
	
	public abstract void url();
	
	public void timeOut() {
		
		System.out.println("page time out is 10 secs");
	}
	
	public final void logo() {
		System.out.println("page logo");
	}
	
	

}
