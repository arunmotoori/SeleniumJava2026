package twodarraypack;

public class DemoE {

	public static void main(String[] args) {
		
		int[] ar = {9,3,5,6,7,2,4,8,15,1,25,11,44,12,89,34,22,55,37};
		
		int max = ar[0];
		
		for(int e:ar) {
			if(e>max) {
				max = e;
			}
		}
		
		System.out.println("Larget element of the Array is "+max);
		
		int min = ar[0];
		
		for(int e:ar) {
			if(e<min) {
				min = e;
			}
		}
		
		System.out.println("Smallest element of the Array is "+min);

	}

}
