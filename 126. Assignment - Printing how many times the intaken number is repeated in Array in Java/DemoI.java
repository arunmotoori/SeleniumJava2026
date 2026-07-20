package twodarraypack;

import java.util.Scanner;

public class DemoI {

	public static void main(String[] args) {
		
		int[] ar = {9,5,7,7,1,5,5,5,5,9,4,9,6};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scanner.nextInt();
		scanner.close();
		
		int count = 0;
		
		for(int e : ar) {
			if(num==e) {
				count++;
			}
		}
		
		System.out.println(num+" is repeated in the array "+count+" times");	

	}

}


