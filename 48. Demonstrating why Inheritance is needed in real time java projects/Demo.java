package packagee;

public class Demo {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		c.pet = true;
		c.tail = true;
		c.color = "Black";
		c.legs = 4;
		c.fly = false;
		c.breed = "Birman";
		
		c.eat();
		c.sleep();
		c.run();
		c.climb();
		c.hunt();
		
		Dog d = new Dog();
		
		d.pet = true;
		d.tail = true;
		d.color = "White";
		d.legs = 4;
		d.fly = false;
		d.breed = "Doberman";
		
		d.eat();
		d.sleep();
		d.run();
		d.bark();
		
		Butterfly b = new Butterfly();
		
		b.pet = false;
		b.tail = false;
		b.color = "Green";
		b.legs = 8;
		b.fly = true;
		
		b.eat();
		b.sleep();
		b.fly();
		
		Lion l = new Lion();
		
		l.pet = false;
		l.tail = true;
		l.color = "orange";
		l.legs = 4;
		l.fly = false;
		
		l.eat();
		l.sleep();
		l.run();
		l.hunt();

	}

}
