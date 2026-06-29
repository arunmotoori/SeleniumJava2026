
public class SampleA {

	public static void main(String[] args) {
		
		Car kC = new Car("Kia", "Carrens", "Black", 2500000, 23.45); // Object will be created
		
		kC.startCar();
		kC.stopCar();
		kC.carDetails();
		
		Car hAmz = new Car("Honda", "Amaze", "Grey", 900000, 14);
		
		hAmz.startCar();
		hAmz.stopCar();
		hAmz.carDetails();
		
		Car mS = new Car("Maruti", "Swift", "Red",800000, 18);
		
		mS.startCar();
		mS.stopCar();
		mS.carDetails();

	}

}
