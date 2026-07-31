package exceptionspack;

import java.util.Scanner;

public class DemoL {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter first number:");
			int a = scanner.nextInt();
			System.out.println("Enter second number:");
			int b = scanner.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			scanner.close();
			System.out.println("Scanner object got closed");
		}
	
		System.out.println("Program execution continues");
		System.out.println("End of this program.");

	}

}
