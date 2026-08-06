package filehandlingpack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoK {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("./hello.txt");
		
		if(!file1.exists()) {
			file1.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file1,true);
		//fw.write("I love Java programming.\nJava is a popular programming language.\nWe are learning File Handling mechanism in Java.\n");
		fw.write("My name is Arun Motoori.");
		//fw.flush();
		fw.close();
		
		System.out.println("End of this program.");

	}

}

