package twodarraypack;

import java.util.Arrays;

public class DemoThree {

	public static void main(String[] args) {
		
		int[] ar = {5,9,3,7,2,6};
		
		System.out.println(ar[3]);
		
		System.out.println(Arrays.toString(ar));
		
		ar[3] = 10;
		
		System.out.println(ar[3]);
		
		System.out.println(Arrays.toString(ar));
		
		int[][] arr = {{1,5,9},{8,4,2}};
		
		System.out.println(arr[1][2]);
		
		System.out.println(Arrays.deepToString(arr));
		
		arr[1][2] = 25;
		
		System.out.println(arr[1][2]);
		
		System.out.println(Arrays.deepToString(arr));

	}

}
