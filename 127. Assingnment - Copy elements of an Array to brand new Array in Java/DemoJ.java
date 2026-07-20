package twodarraypack;

import java.util.Arrays;

public class DemoJ {

	public static void main(String[] args) {
		
		int[] ar = {9,3,1,7,5,2,6,8};
		
		int[] br = new int[ar.length];
		
		for(int i=0;i<br.length;i++) {
			br[i] = ar[i];
		}
		
		System.out.println(Arrays.toString(br));

	}

}

