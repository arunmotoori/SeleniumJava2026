package exceptionspack;

import java.util.Scanner;

public class DemoM {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		scanner.close();
		
		if(age<18) {
			throw new Exception("Age cannot be less than 18");
		}else {
			System.out.println("Welcome to this Application.");
		}
		
		System.out.println("End of this program");

	}

}
