package inheritance.packaged;

public class Demo {

	public static void main(String[] args) {
		
		ClassP a = new ClassC();
		System.out.println(a.p);
		//System.out.println(a.c);
		a.methodP();
		//a.methodC();
		
	}

}
