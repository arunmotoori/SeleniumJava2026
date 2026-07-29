package exceptionspack;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoJ {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("C:\\Users\\arunm\\OneDrive\\Documents\\WorkspaceA\\SampleProjectOne\\abcd.txt");
		}catch(FileNotFoundException e) {
			System.out.println("File not available at the given path");
		}
		
		System.out.println("Program continues");
		System.out.println("End of this program.");
	}

}

