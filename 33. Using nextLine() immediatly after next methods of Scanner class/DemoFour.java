package scannerpack;

import java.util.Scanner;

public class DemoFour {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int num = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter any line of text:");
		String str = scanner.nextLine();
		
		System.out.println(str);
		System.out.println(num);
		
		scanner.close();

	}

}
