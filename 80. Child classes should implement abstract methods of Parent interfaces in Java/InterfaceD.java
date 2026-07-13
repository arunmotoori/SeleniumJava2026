package interfacepack;

public interface InterfaceD {
	
	public void sampleOne();
	public void sampleTwo();
	public void sampleThree();

}

abstract class ClassY implements InterfaceD {
	
	
	
}

class ClassX extends ClassY {
	
	@Override
	public void sampleOne() {
		System.out.println("Inside sampleOne");
	}
	
	@Override
	public void sampleTwo() {
		System.out.println("Inside sampleTwo");
	}
	
	@Override
	public void sampleThree() {
		System.out.println("Inside sampleThree");
	}
	
}



class ClassZ implements InterfaceD {
	
	@Override
	public void sampleOne() {
		System.out.println("Inside sampleOne");
	}
	
	@Override
	public void sampleTwo() {
		System.out.println("Inside sampleTwo");
	}
	
	@Override
	public void sampleThree() {
		System.out.println("Inside sampleThree");
	}
	
}
