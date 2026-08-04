package filehandlingpack;

import java.io.File;
import java.io.IOException;

public class DemoG {

	public static void main(String[] args) throws IOException {
		
//		File folder1 = new File("./FolderD");
//		folder1.mkdir();
//		File file1 = new File("./FolderD/efh.txt");
//		file1.createNewFile();
//		System.out.println("End of this program.");
		
		File folder2 = new File("./FolderE");
		
		folder2.mkdir();
		
		File file2 = new File(folder2,"hij.txt");
		
		file2.createNewFile();
		
		System.out.println("End of this program.");

	}

}
