package polypack;

public class Animal {
	
	public void sound() {
		System.out.println("Animal is making sound");		
	}
	
}

class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Dog is barking");
	}
	
}

class Cat extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Cat is meowing");
	}

}