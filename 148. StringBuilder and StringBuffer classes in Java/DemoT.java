package stringspack;

public class DemoT {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");
		
		sb.setLength(0);
		
		sb.append("Python");
		
		System.out.println(sb);
		
		StringBuffer sf = new StringBuffer("CSharp");
		
		sf.setLength(0);
		
		sf.append("Python");
		
		System.out.println(sf);

	}

}
