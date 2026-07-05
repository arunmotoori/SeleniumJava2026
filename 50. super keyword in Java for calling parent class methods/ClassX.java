package packageh;

public class ClassX {

	public static void main(String[] args) {
		
		ClassC cc = new ClassC();
		cc.methodX();

	}

}

class ClassP {
	
	public void sample() {
		System.out.println("ClassP - sample() method");
	}
	
	public void methodY() {
		System.out.println("methodY");
	}
	
}

class ClassC extends ClassP {
	
	public void sample() {
		System.out.println("ClassC - sample() method");
	}
	
	public void methodX() {
		 super.sample();
		//super.methodY();
	}
	
}
