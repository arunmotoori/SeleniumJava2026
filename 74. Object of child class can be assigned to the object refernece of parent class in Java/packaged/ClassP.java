package inheritance.packaged;

class ClassP {
	
	int p = 5;
	
	public void methodP() {
		System.out.println("Inside methodP");
	}

}

class ClassC extends ClassP {
	
//	int p = 5;

	@Override
	public void methodP() {
		System.out.println("Inside methodP - Two");
	}
	
	int c = 10;
	
	public void methodC() {
		System.out.println("Inside methodC");
	}
	
}
