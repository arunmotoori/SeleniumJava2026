package exceptionspack;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoK {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr = new FileReader("C:\\Users\\arunm\\OneDrive\\Documents\\WorkspaceA\\SampleProjectOne\\abcd.txt");

		System.out.println("Program execution continues");
		System.out.println("End of this program.");
	}

}
