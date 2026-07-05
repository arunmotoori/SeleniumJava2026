package packagel;

public class ClassX {

	public static void main(String[] args) {
		
		new Dog();

	}

}

class Animal {
	
	public Animal() {
		System.out.println("Animal");
	}
	
}

class Dog extends Animal {
	
	public Dog() {
		System.out.println("Dog");
	}
	
}
