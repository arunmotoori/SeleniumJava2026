package stringspack;

public class DemoJ {

	public static void main(String[] args) {
		
		String s1 = "Arun Motoori";
		System.out.println(s1.indexOf("r")); // 1
		System.out.println(s1.lastIndexOf("r")); //10
		String s2 = "I love Java programming.Java is a popular programming language";
		System.out.println(s2.indexOf("Java")); // 7
		System.out.println(s2.lastIndexOf("Java")); // 24
		System.out.println(s2.indexOf("Python")); // -1
		
		if(s2.indexOf("Java")!=-1) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		
		if(s2.indexOf("Python")!=-1) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}

	}

}
