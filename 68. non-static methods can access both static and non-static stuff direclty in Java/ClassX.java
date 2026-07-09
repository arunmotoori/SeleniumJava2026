package modifierspack.staticthree;

public class ClassX {
	
	static int wheels = 4; // static global variable
	String company = "Honda"; // non-static global variable
	
	public void sampleOne() {
		
		System.out.println(wheels);
		System.out.println(company);
		sampleTwo();
		sampleThree();
		
	}
	
	public static void sampleTwo() {
		System.out.println("Inside sampleTwo static method");
	}
	
	public void sampleThree() {
		System.out.println("Inside sampleThree non-static method");
	}

}
