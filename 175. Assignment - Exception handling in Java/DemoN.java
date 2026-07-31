package exceptionspack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoN {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] m = new int[5];
			int sum = 0;
			
			for(int i=0;i<5;i++) {
				
				System.out.println("Enter marks of Subject "+(i+1)+":");
				m[i] = scanner.nextInt();
				
				if(m[i] < 0 || m[i] > 100) {
					throw new IllegalArgumentException("Incorrect marks entered.");
				}
				
				sum = sum + m[i];
				
			}
			
			double avg = (double)sum/m.length;
			System.out.println(avg);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Invalid input entered.");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			scanner.close();
		}

	}

}
