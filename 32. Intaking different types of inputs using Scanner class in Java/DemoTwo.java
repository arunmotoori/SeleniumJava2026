package scannerpack;

import java.util.Scanner;

public class DemoTwo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a single line of text:");
		String d = scanner.nextLine();
		System.out.println("Enter an integer non-decimal number:");
		int a = scanner.nextInt();
		System.out.println("Enter a decimal number:");
		double b = scanner.nextDouble();
		System.out.println("Enter a single word:");
		String c = scanner.next();
		System.out.println("Enter a boolean value:");
		boolean e = scanner.nextBoolean();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		scanner.close();

	}

}
