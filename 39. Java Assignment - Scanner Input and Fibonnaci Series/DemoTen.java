package scannerpack;

import java.util.Scanner;

public class DemoTen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int limit = scanner.nextInt();
		
		int a = 0, b = 1;
		
		while(a <= limit) {
			
			System.out.print(a+" ");
			
			int next = a+b;
			a = b; // 2
			b = next; // 3
			
		}
		
		scanner.close();
		

	}

}
