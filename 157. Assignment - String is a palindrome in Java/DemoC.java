package stringspacktwo;

public class DemoC {

	public static void main(String[] args) {
		
		String orig = "radar";
		
		System.out.println(orig);
		
		String rev = "";
		
		for(int i=orig.length()-1;i>=0;i--) {
			rev = rev + orig.charAt(i); 
		}
		
		System.out.println(rev);
		
		System.out.println(orig.equals(rev)? "Palindrome":"Not a Palindrome");
		
//		if(orig.equals(rev)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not a Palindrome");
//		}

	}

}
