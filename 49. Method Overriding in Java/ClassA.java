package packageg;

class ClassA {
	
	int a = 5;
	
	public void sample() {
		System.out.println(a);
	}

}

class ClassB extends ClassA {
	
	int b = 10;
	
	//Overridden method - Is overriding the parent class method
	public void sample() {
		System.out.println(b);
	}
	
}
