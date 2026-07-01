package scannerpack;

import java.util.Scanner;

public class DemoEight {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle:");
		double r = scanner.nextDouble();
		
		double areaOfCircle = 3.14 * r * r;
		
		System.out.println("Area of the circle is: "+areaOfCircle);
		
		scanner.close();

	}

}
