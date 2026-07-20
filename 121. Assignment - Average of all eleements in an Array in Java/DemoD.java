package twodarraypack;

public class DemoD {

	public static void main(String[] args) {
		
		int[] ar = {9,2,7,5,3,4,6,8};
		
		int sum = 0;
		
		for(int e:ar) {
			sum+=e;
		}
		
		int size = ar.length;
		
		double average = (double) sum/size;
		
		System.out.println(average);

	}

}

