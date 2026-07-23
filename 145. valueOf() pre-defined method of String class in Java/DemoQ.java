package stringspack;

public class DemoQ {

	public static void main(String[] args) {
		
		byte a = 5;
		short b = 10;
		int c = 15;
		long d = 25L;
		float e = 1.34F;
		double f = 2.33;
		char g = 's';
		boolean h = true;
		
		String sa = String.valueOf(a); // "5"
		System.out.println(sa+1);
		
		String sb = String.valueOf(b);
		System.out.println(sb+1);
		
		String sc = String.valueOf(c);
		System.out.println(sc+1);
		
		String sd = String.valueOf(d);
		System.out.println(sd+1);
		
		String se = String.valueOf(e);
		System.out.println(se+1);
		
		String sf = String.valueOf(f);
		System.out.println(sf+1);
		
		String sg = String.valueOf(g);  // "s"
		System.out.println(sg.length());
		
		String sh = String.valueOf(h);
		System.out.println(sh+1);

	}

}
