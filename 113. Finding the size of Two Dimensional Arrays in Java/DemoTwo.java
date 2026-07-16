package twodarraypack;

public class DemoTwo {

	public static void main(String[] args) {
		
		int[][] ar = {{9,11,5,7},{3,6,8,2},{4,1,15,14}};
		
		int rows = ar.length;
		System.out.println(rows);
		
		int firstRowColumns = ar[0].length;
		System.out.println(firstRowColumns);
		
		int secondRowColumns = ar[1].length;
		System.out.println(secondRowColumns);
		
		int thirdRowColumns = ar[2].length;
		System.out.println(thirdRowColumns);
		
		for(int i=0;i<ar.length;i++) {  // 3
			for(int j=0;j<ar[i].length;j++) { // 4
				System.out.print(ar[i][j]+" ");  
			}
			System.out.println();
		}
		
	}

}
