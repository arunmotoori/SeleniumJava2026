package twodarraypack;

public class DemoFive {

	public static void main(String[] args) {
		
		int[][] jar = {{1,2,3},{8,4,6,9},{5,7},{11,15,0,18}};
		
		for(int i=0;i<jar.length;i++) {
			
			for(int j=0;j<jar[i].length;j++) {
				
				System.out.print(jar[i][j]+" ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("----------------------");
		
		for(int[] sar : jar) {
			for(int e : sar) {
				System.out.print(e+" ");
			}
			System.out.println();
		}

	}

}
