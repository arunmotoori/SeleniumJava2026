
public class SampleA {

	public static void main(String[] args) {
		
		Car kC = new Car(); // Object will be created
		
		kC.company = "Kia";
		kC.model = "Carrens";
		kC.color = "Black";
		kC.price = 2500000;
		kC.milage = 23.45;
		kC.wheels = 4;
		
		kC.startCar();
		kC.stopCar();
		kC.carDetails();
		

	}

}
