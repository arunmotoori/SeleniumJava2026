package filehandlingpack;

import java.io.File;
import java.io.IOException;

public class DemoB {

	public static void main(String[] args) throws IOException {
		
		//Represent a file
		File file1 = new File("C:\\Users\\arunm\\OneDrive\\Desktop\\FolderA\\xyz.txt");
		
		//Creating new file
		//file1.createNewFile();
		
//		if(file1.createNewFile()) {
//			System.out.println("new file got created");
//		}else {
//			System.out.println("new file is not created");
//		}
		
		if(!file1.exists()) {
			file1.createNewFile();
			System.out.println("File got created");
		}else {
			System.out.println("File already exists, hence not created again");
		}

	}

}


