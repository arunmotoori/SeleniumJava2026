package filehandlingpack;

import java.io.File;

public class DemoA {

	public static void main(String[] args) {
		
		//Represent a file in Java
		File file1 = new File("C:\\Users\\arunm\\OneDrive\\Desktop\\FolderA\\def.txt");
		
//		boolean status = file1.exists();
//		System.out.println(status);
		
//		if(file1.exists()) {
//			System.out.println("File is available");
//		}else {
//			System.out.println("File is not available");
//		}
		
		System.out.println(file1.exists()?"File is available":"File is not availble");
		
	}

}

