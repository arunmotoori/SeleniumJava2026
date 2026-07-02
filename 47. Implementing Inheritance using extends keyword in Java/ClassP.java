package packaged;

class ClassP {
	
	int p = 5;
	
	public void methodP() {
		System.out.println("Inside methodP");
	}

}

class ClassC extends ClassP {
	
	int c = 10;
	
	public void methodC() {
		System.out.println("Inside methodC");
	}
	
}
