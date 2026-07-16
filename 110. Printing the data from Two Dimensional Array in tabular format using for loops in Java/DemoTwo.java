package twodarraypack;

public class DemoTwo {

	public static void main(String[] args) {
		
		int[][] ar = new int[3][4];
		
		ar[0][0] = 9;
		ar[0][1] = 11;
		ar[0][2] = 5;
		ar[0][3] = 7;
		
		ar[1][0] = 3;
		ar[1][1] = 6;
		ar[1][2] = 8;
		ar[1][3] = 2;
		
		ar[2][0] = 4;
		ar[2][1] = 1;
		ar[2][2] = 15;
		ar[2][3] = 14;
		
		for(int r=0;r<3;r++) {  // 3
			
			for(int c=0;c<4;c++) { // 4
				
				System.out.print(ar[r][c]+" "); // 9 11 5 7 3 6 8 2 4 1 15 14 
				
			}
			
			System.out.println();
			
		}

	}

}
