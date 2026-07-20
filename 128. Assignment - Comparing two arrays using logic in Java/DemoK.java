package twodarraypack;

public class DemoK {

	public static void main(String[] args) {
		
		int[] ar = {9,1,3,2,5};
		int[] br = {9,1,3,2,5};
		
		boolean equal = true;
		
		if(ar.length!=br.length) {
			equal = false;
		}else {
			for(int i=0;i<ar.length;i++) {
				if(ar[i]!=br[i]) {
					equal = false;
					break;
				}
			}
		}
		
		System.out.println(equal ? "Equal" : "Not Equal");
		
	}

}
