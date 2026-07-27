package exceptionspack;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoA {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter first number:");
			int a = scanner.nextInt();
			System.out.println("Enter second number:");
			int b = scanner.nextInt();
			scanner.close();
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Exception 1"+e);
		}catch(InputMismatchException e) {
			System.out.println("Exception 2"+e);
		}
		
		System.out.println("End of this program.");
		
	}

}

