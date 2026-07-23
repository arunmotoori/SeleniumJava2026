package stringspack;

public class DemoV {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");
		
		sb.insert(0,"Core ");
		System.out.println(sb);
		
//		sb.append(" Programming");
//		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("Aun");
		
		sb2.insert(1,"r");
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder("Arun");
		
		sb3.insert(sb3.length()," Motoori");
		System.out.println(sb3);

	}

}
