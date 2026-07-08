package modifierspack.finalpack;

public class ClassX {
	
	int minAmount = 5;
	final int MIN_VALUE = 25;
	
	public void sample() {
		
		minAmount = 10;
		//MIN_VALUE = 50; - Error
		
	}

}

class ClassY {
	
	final int b;
	
	ClassY(){
	    b = 15;
	}
	
	
}

