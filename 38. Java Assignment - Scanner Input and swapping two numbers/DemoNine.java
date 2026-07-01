package scannerpack;

import java.util.Scanner;

public class DemoNine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number:");
		int num2 = scanner.nextInt();
		
		System.out.println("Before swapping:");
		System.out.println("First Number is "+num1);
		System.out.println("Second Number is "+num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping:");
		System.out.println("First Number is "+num1);
		System.out.println("Second Number is "+num2);
		
		scanner.close();
	}

}
