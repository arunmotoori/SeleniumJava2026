
public class DemoF {

	public static void main(String[] args) {
		
		add(9,5);
		subtract(6,2);
		multiply(4,3);
		divide(8,5);

	}
	
	public static void add(int a,int b) {
		int sum = a+b;
		System.out.println("Sum of "+a+" and "+b+" is: "+sum);
	}
	
	public static void subtract(int a,int b) {
		int sub = a-b;
		System.out.println("Subtraction of "+a+" and "+b+" is: "+sub);
	}
	
	public static void multiply(int a,int b) {
		int mul = a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is: "+mul);
	}
	
	public static void divide(int a,int b) {
		int div = a/b;
		System.out.println("Division of "+a+" and "+b+" is: "+div);
	}

}

