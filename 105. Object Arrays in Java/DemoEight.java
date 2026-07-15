package arrayspack;

import java.util.Arrays;

public class DemoEight {

	public static void main(String[] args) {
		
		Object[] ar = {9,15,'$',4,true,2,6.3,"Arun"};
		
		System.out.println(Arrays.toString(ar));
		
		for(Object e : ar) {
			System.out.println(e);
		}

	}

}
