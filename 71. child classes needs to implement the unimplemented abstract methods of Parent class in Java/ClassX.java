package modifierspack.abstarctwo;

public abstract class ClassX {
	
	public abstract void sampleA();
	
	public abstract void sampleB();
	
	public abstract void sampleC();
	
	public void sampleD() {
		System.out.println("SampleD");
	}
	
	public void sampleE() {
		System.out.println("SampleE");
	}

}

class ClassY extends ClassX {
	
	@Override
	public void sampleA() {
		System.out.println("SampleA");
	}
	
	@Override
	public void sampleB() {
		System.out.println("SampleB");
	}
	
	@Override
	public void sampleC() {
		System.out.println("SampleC");
	}
	
}

