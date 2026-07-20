package twodarraypack;

import java.util.Scanner;

public class DemoF {

	public static void main(String[] args) {
		
		int[] ar = {9,2,3,7,5,6,8,1,4};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int num = scanner.nextInt();
		
		scanner.close();
		
		boolean found = false;
		
		for(int e : ar) {
			if(num==e) {
				found = true;
				break;
			}
		}
		
		String status = found ? "Found" : "NotFound";
		System.out.println(status);

	}

}
