package modifierspack.defaultpack;

class Car {
	
	String company;
	int wheels;
	
	Car(){
		System.out.println("Inside Car constructor");
	}
	
	void startCar() {
		//public int a = 5; - Not possible - Illegal modifier
		System.out.println("Car started");
	}
	
	void stopCar() {
		System.out.println("Car stopped");
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.company = "Honda";
		c.wheels = 4;
		c.startCar();
		c.stopCar();
	}

}
