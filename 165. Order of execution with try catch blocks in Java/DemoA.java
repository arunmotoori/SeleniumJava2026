package exceptionspack;
import java.util.Scanner;

public class DemoA {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = scanner.nextInt();
		System.out.println("Enter second number:");
		int b = scanner.nextInt();
		scanner.close();
		
		try {
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide a number by 0");
		}
		
		System.out.println("Program execution continues");
		System.out.println("End of this program");
		
	}

}

