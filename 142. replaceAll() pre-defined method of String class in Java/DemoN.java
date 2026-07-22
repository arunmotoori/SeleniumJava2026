package stringspack;

public class DemoN {

	public static void main(String[] args) {
		
		String str = "Arun Motoori";
		
		String s2 = str.replaceAll("[ru]","e");
		System.out.println(s2); // Aeen Motooei
		
		String s3 = str.replaceAll("[ru]","19");
		System.out.println(s3); // A1919n Motoo19i

	}

}
