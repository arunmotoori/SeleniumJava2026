package filehandlingpack;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoL {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("./hello.txt");
		
		FileReader fr = new FileReader(file1);
		
		int n = fr.read();
		
		while(n!=-1) {
			
			char c = (char)n;
			System.out.print(c);
			n = fr.read();
			
		}
		
		fr.close();
	
	}

}

