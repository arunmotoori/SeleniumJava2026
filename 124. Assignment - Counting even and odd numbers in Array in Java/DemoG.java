package twodarraypack;

public class DemoG {

	public static void main(String[] args) {
		
		int[] ar = {9,3,1,7,2,5,6,8,4};
		
		int even = 0;
		int odd = 0;
		
		for(int e:ar) {
			if(e%2==0) {
			   even++;  
			}else {
			   odd++;  
			}
		}
		
		System.out.println("Even count is "+even);
		System.out.println("Odd count is "+odd);

	}

}

