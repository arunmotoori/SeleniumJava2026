package stringbuilderpack;

public class DemoB {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Arun Motoori");
		
		System.out.println(sb);
		
		sb.delete(4, 12);
		
		System.out.println(sb);

	}

}
