package filehandlingpack;

import java.io.File;

public class DemoH {

	public static void main(String[] args) {
		
		File file1 = new File("./abc.txt");
		File folder1 = new File("./FolderA");
		
		System.out.println(file1.isFile());
		System.out.println(folder1.isFile());
		
		if(file1.isFile()) {
			System.out.println("It is a file");
		}else {
			System.out.println("Its not a file");
		}
		
		if(folder1.isFile()) {
			System.out.println("It is a file");
		}else {
			System.out.println("Its not a file");
		}

	}

}
