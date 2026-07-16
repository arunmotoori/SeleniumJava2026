package twodarraypack;

import java.util.Arrays;
import java.util.Collections;

public class DemoSix {

	public static void main(String[] args) {
		
		Integer[] ar1 = {9,1,5,3,7,2,6,4};
		
		System.out.println(Arrays.toString(ar1));
		
		Arrays.sort(ar1);
		
		System.out.println(Arrays.toString(ar1));
		
		Arrays.sort(ar1,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(ar1));
		
		String[] ar2 = {"Tharun","Varun","Arun"};
		
		System.out.println(Arrays.toString(ar2));
		
		Arrays.sort(ar2);
		
		System.out.println(Arrays.toString(ar2));
		
		Arrays.sort(ar2,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(ar2));

	}

}
