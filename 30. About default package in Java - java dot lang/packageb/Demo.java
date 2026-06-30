package packageb;

import packagea.Sample;

public class Demo {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		System.out.println(s.a);
		s.sampleA();
		
		System.out.println(Sample.b);
		Sample.sampleB();
		
	}

}
