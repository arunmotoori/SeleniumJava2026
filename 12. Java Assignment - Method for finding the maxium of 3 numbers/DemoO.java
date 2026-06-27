
public class DemoO {

	public static void main(String[] args) {
		
		int r1 = findMaxNumber(3,6,9);
		System.out.println("Maximum is: "+r1);
		
		int r2 = findMaxNumber(10,44,2);
		System.out.println("Maximum is: "+r2);
		
		int r3 = findMaxNumber(100,50,25);
		System.out.println("Maximum is: "+r3);

	}
	
	public static int findMaxNumber(int a,int b,int c) {
		int max = a;
		
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		return max;
	}

}
