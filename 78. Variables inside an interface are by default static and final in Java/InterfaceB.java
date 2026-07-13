package interfacepack;

public interface InterfaceB {
	
	double MIN_VALUE = 5.4;  // by default - static and final

}

class Sample {
	
	public void demo() {
		
		System.out.println(InterfaceB.MIN_VALUE);
		InterfaceB.MIN_VALUE = 10.3;
		
	}
	
}

