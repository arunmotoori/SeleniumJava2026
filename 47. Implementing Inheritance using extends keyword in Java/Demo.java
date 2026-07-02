package packaged;

public class Demo {

	public static void main(String[] args) {
		
		ClassC cc = new ClassC();
		
		System.out.println(cc.p);
		System.out.println(cc.c);
		
		cc.methodP();
		cc.methodC();
		
		ClassP cp = new ClassP();
		
		System.out.println(cp.p);
		cp.methodP();

	}

}
