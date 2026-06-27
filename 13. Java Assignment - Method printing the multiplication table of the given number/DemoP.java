
public class DemoP {

	public static void main(String[] args) {
		
		printMultiplicationTable(5);

	}
	
	public static void printMultiplicationTable(int n) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
		
	}

}
