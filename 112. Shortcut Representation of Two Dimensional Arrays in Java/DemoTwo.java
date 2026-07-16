package twodarraypack;

public class DemoTwo {

	public static void main(String[] args) {
		
		int[][] ar = {{9,11,5,7},{3,6,8,2},{4,1,15,14}};
		
		for(int[] a : ar) {
			for(int e : a) {
				System.out.print(e+" ");
			}
			System.out.println();
		}

	}

}
