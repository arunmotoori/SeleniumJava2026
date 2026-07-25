package stringspacktwo;

import java.util.Scanner;

public class DemoE {

	public static void main(String[] args) {
		
		String statement = "I love Java programming.";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any word:");
		String word = scanner.next();
		scanner.close();
		
		if(statement.indexOf(word)!=-1) {
			System.out.println("Available");
		}else {
			System.out.println("Not Available");
		}
		
	}

}
