package stringspacktwo;

import java.util.Scanner;

public class DemoD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any statement:");
		String statement = scanner.nextLine();
		scanner.close();
		
		String[] words = statement.split(" ");
		
		System.out.println(words.length);

	}

}
