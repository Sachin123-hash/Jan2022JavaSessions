package OOP_Interface;

public class College extends University  implements IndianEducation,UsEducation,UkEducation  {
	@Override
	public void engineering() {
		System.out.println("College--IndianEducation---engineering");
	}

	@Override
	public void medical() {
		System.out.println("College--IndianEducation---medical");

	}

	@Override
	public void political() {
		System.out.println("College--IndianEducation--- political");

	}

	public void commerce() {
		System.out.println("College---commerce");
	}

	@Override
	public void law() {
		System.out.println("College---law");
		
	}

	@Override
	public void aeronautical() {
		System.out.println("College---aeronautical");
		
	}

	@Override
	public void automobile() {
		System.out.println("College---automobile");
		
		
	}
	@Override
	public void batch() {

		System.out.println("College-----batch");

	}
	@Override
	public void course() {
		System.out.println("College---course");
	}
}
