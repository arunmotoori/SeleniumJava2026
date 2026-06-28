
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
		
		Car hAmz = new Car();
		
		hAmz.company = "Honda";
		hAmz.model = "Amaze";
		hAmz.color = "Grey";
		hAmz.price = 900000;
		hAmz.milage = 14;
		hAmz.wheels = 4;
		
		hAmz.startCar();
		hAmz.stopCar();
		hAmz.carDetails();
		
		Car mS = new Car();
		
		mS.company= "Maruti";
		mS.model = "Swift";
		mS.color = "Red";
		mS.price = 800000;
		mS.milage = 18;
		mS.wheels = 4;
		
		mS.startCar();
		mS.stopCar();
		mS.carDetails();

	}

}
