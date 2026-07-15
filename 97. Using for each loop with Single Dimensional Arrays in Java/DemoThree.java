package arrayspack;

public class DemoThree {

	public static void main(String[] args) {
		
		//Creating single dimensional array
		int[] ar = new int[6];
		
		//Initialing the single dimensional array
		ar[0] = 9;
		ar[1] = 5;
		ar[2] = 3;
		ar[3] = 7;
		ar[4] = 1;
		ar[5] = 2;
		
		//Access the data stored in the single dimensional array
//		for(int i=0;i<6;i++) {  // 6
//			System.out.println(ar[i]); // 9 5 3 7 1 2 
//		}
		
		//for-each loop
		for(int e:ar) {
			System.out.println(e); // 9 5 3 7 1 2 
		}
		
//		for(int i=1;i<4;i++) {  // 4
//			System.out.println(ar[i]); // 5 3 7 
//		}
		
	}

}

