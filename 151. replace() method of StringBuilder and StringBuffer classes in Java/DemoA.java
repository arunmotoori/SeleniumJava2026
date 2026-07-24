package stringbuilderpack;

public class DemoA {

	public static void main(String[] args) {
		
//		String str = "Core Java";
//		
//		String s2 = str.replace("Core","Advanced");
//		
//		System.out.println(s2);
		
		StringBuilder sb = new StringBuilder("Core Java");
		
		sb.replace(0, 4, "Advanced");
		
		System.out.println(sb);
		
		

	}

}
