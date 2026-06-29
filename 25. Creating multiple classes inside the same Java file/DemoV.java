
public class DemoV {
	
	public static void main(String[] args) {
		
		DemoW dw = new DemoW();
		System.out.println(dw.a);
		dw.sampleA();
		
		System.out.println(DemoW.b);
		DemoW.sampleB();
		
	}
	
}

class DemoW {
	
	int a = 5;
	static int b = 10;
	
	public void sampleA() {
		System.out.println("Inside sampleA method");
	}
	
	public static void sampleB() {
		System.out.println("Inside sampleB method");
	}
	
}



