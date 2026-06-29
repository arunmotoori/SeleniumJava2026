
public class SampleA {

	public static void main(String[] args) {
		
		Car kC = new Car(); // Object will be created
		
		kC.initVar("Kia", "Carrens", "Black", 2500000, 23.45);
		
		kC.startCar();
		kC.stopCar();
		kC.carDetails();
		
		Car hAmz = new Car();
		
		hAmz.initVar("Honda", "Amaze", "Grey", 900000, 14);
		
		hAmz.startCar();
		hAmz.stopCar();
		hAmz.carDetails();
		
		Car mS = new Car();
		
		mS.initVar("Maruti", "Swift", "Red",800000, 18);
		
		mS.startCar();
		mS.stopCar();
		mS.carDetails();

	}

}
