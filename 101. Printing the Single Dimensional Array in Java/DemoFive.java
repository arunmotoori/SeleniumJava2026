package arrayspack;

import java.util.Arrays;

public class DemoFive {

	public static void main(String[] args) {
		
		int[] ar = {9,3,1,4,2,6,8};
		
		System.out.println(ar); 
		
		System.out.println("-------------------");
		
		System.out.println(Arrays.toString(ar));
		
		System.out.println("------------------");
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("----------------");
		
		for(int e:ar) {
			System.out.println(e);
		}
		
		System.out.println("------------------");
		
	}

}

