package modifierspack.statictwo;

public class ClassX {
	
	static int wheels = 4;
	String company = "Honda";

	public static void main(String[] args) {
		
		System.out.println(wheels);
		sampleTwo();
		ClassX cx = new ClassX();
		System.out.println(cx.company);
		cx.sampleThree();

	}
	
	public static void sampleOne() {
		
		System.out.println(wheels);
		sampleTwo();
		ClassX cx = new ClassX();
		System.out.println(cx.company);
		cx.sampleThree();
		
	}
	
	public static void sampleTwo() {
		System.out.println("Inside sampleTwo static method");
	}
	
	public void sampleThree() {
		System.out.println("Inside sampleThree instance method");
	}

}
