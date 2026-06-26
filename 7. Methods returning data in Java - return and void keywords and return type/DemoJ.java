
public class DemoJ {

	public static void main(String[] args) {
		add(5,4);
		int r = sub(9,5);
		System.out.println(r);
		String str = giveName();
		System.out.println(str);
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
