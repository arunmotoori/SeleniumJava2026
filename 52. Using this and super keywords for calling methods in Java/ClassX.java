package packagei;

public class ClassX {
	
	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		cb.methodX();
		
	}

}


class ClassA {
	
	public void sample() {
		System.out.println("Parent class sample method");
	}
	
	public void methodY() {
		System.out.println("Parent class methodY method");
	}
	
}

class ClassB extends ClassA {
	
	@Override
	public void sample() {
		System.out.println("Child class sample method");
	}
	
	public void methodX() {
		sample();
		this.sample();
		super.sample();
		methodY();
		super.methodY();
	}
}

