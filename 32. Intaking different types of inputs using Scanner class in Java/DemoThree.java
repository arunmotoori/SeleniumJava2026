package scannerpack;

import java.util.Scanner;

// Ctrl + Shift + O

public class DemoThree {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a integer non-decimal number:");
		int num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a single line");
		String s = scanner.nextLine();
		
		System.out.println("--------------------");
		System.out.println(num1);
		System.out.println(s);
		
		scanner.close();

	}

}
