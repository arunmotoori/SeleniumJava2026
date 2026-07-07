package modifierspack.privatepack;

public class Car {
	
	private String company;
	private int wheels;
	
	private Car(){
		System.out.println("Inside Car constructor");
	}
	
	private void startCar() {
		//public int a = 5; - Not possible - Illegal modifier
		System.out.println("Car started");
	}
	
	private void stopCar() {
		System.out.println("Car stopped");
	}
	
	public static void main() {
		
		Car c = new Car();
		c.company = "Honda";
		c.wheels = 4;
		c.startCar();
		c.stopCar();
	}

}
