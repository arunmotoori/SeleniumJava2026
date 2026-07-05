package packagem;

public class ClassX {

	public static void main(String[] args) {
		
		new Dog();

	}

}

class Animal {
	
	public Animal(int a) {
		System.out.println("Animal"+a);
	}
	
}

class Dog extends Animal {
	
	public Dog() {
		super(5);
		System.out.println("Dog");
	}
	
}


