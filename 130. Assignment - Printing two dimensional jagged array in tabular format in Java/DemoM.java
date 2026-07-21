package twodarraypack;

public class DemoM {

	public static void main(String[] args) {

		char[][] arr = {
				        {'s','a','m'},
				        {'v','a','r','u','n'},
				        {'a','m','i','t'},
				        {'p','i'},
				        {'s','a','m','p','a','t','h'}
				       };
		
		for(int r=0;r<arr.length;r++) {
			
			for(int c=0;c<arr[r].length;c++) {
				
				System.out.print(arr[r][c]+" ");
				
			}
			
			System.out.println();
			
		}

	}

}
