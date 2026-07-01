package scannerpack;

import java.util.Scanner;

public class DemoFive {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a line of text:");
		String s1 = scanner.nextLine();
		System.out.println("Enter a line of text:");
		String s2 = scanner.next();
		
		System.out.println(s1);
		System.out.println(s2);
		
		scanner.close();

	}

}
