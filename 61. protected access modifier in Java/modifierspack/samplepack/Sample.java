package modifierspack.samplepack;

import modifierspack.protectedpack.Car;

public class Sample {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.company = "Honda";
		c.wheels = 4;
		c.startCar();
		c.stopCar();
		
	}

}
