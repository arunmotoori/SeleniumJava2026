package stringspack;

public class DemoO {

	public static void main(String[] args) {
		
		String str = "I love Java programming";
		
		String[] ar = str.split(" ");
		
		System.out.println(ar[0]); //I
		System.out.println(ar[1]); //love
		System.out.println(ar[2]); //Java
		System.out.println(ar[3]); //programming

	}

}

