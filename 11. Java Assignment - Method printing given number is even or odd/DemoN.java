
public class DemoN {

	public static void main(String[] args) {
		printEvenOrOdd(9);
		printEvenOrOdd(4);
	}
	
	public static void printEvenOrOdd(int num) {
		
		if(num%2==0) {
			System.out.println(num+" is even number");
		}else {
			System.out.println(num+" is odd number");
		}
		
	}

}
