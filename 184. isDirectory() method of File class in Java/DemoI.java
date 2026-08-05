package filehandlingpack;

import java.io.File;

public class DemoI {

	public static void main(String[] args) {
		
		File file1 = new File("./abc.txt");
		File folder1 = new File("./FolderA");
		
		System.out.println(file1.isDirectory());
		System.out.println(folder1.isDirectory());
		
		if(file1.isDirectory()) {
			System.out.println("Its a folder");
		}else {
			System.out.println("Its not a folder");
		}
		
		if(folder1.isDirectory()) {
			System.out.println("Its a folder");
		}else {
			System.out.println("Its not a folder");
		}

	}

}
