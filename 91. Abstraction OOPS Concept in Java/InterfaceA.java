package interfacepack;

public interface InterfaceA {
	
	public void sampleA();
	public void sampleB();
	public void sampleC();
	public void sampleD();
	
}

class ClassA implements InterfaceA {

	@Override
	public void sampleA() {
		System.out.println("Child class - sampleA");
	}

	@Override
	public void sampleB() {
		System.out.println("Child class - sampleB");
	}

	@Override
	public void sampleC() {
		System.out.println("Child class - sampleC");
	}

	@Override
	public void sampleD() {
		System.out.println("Child class - sampleD");
	}
	
	
}

