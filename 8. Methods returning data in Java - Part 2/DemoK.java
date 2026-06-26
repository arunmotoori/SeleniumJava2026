
public class DemoK {

	public static void main(String[] args) {
		add(5,4);
		System.out.println(sub(9,5));
		System.out.println(giveName());
	}
	
	public static void add(int a,int b) {
		int sum = a+b;
		System.out.println("Sum is "+sum);
	}
	
	public static int sub(int a,int b) {
		int sub =a-b;
		return sub;
	}
	
	public static String giveName() {
		return "Arun";
	}

}
