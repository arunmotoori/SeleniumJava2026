package modifierspack.publicpack;

public class Car {
	
	public String company;
	public int wheels;
	
	public Car(){
		System.out.println("Inside Car constructor");
	}
	
	public void startCar() {
		//public int a = 5; - Not possible - Illegal modifier
		System.out.println("Car started");
	}
	
	public void stopCar() {
		System.out.println("Car stopped");
	}

}
