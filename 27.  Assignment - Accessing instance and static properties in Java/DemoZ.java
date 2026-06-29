
public class DemoZ {
	
	public static void main(String[] args) {
		
		DemoAB dab =  new DemoAB();
		System.out.println(dab.a);
		dab.sampleX();
		
		System.out.println(DemoAB.b);
		DemoAB.sampleY();
		
	}

}

class DemoAB {
	
	int a = 2;
	static int b = 4;
	
	public void sampleX() {
		System.out.println("Inside sampleX method");
	}
	
	public static void sampleY() {
		System.out.println("Inside sampleY method");
	}
	
	
}
