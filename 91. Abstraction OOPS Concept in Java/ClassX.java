package modifierspack.abstractone;

public abstract class ClassX {
	
	public void sampleA() {
		System.out.println("Inside sampleA");
	}
	
	public abstract void sampleB();

}

class ClassY extends ClassX {

	@Override
	public void sampleB() {
		System.out.println("Inside ClassY - sampleB method");		
	}
	
}


