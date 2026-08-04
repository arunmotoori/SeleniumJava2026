package filehandlingpack;

import java.io.File;

public class DemoF {

	public static void main(String[] args) {
		
		//Representing the folder
		File folder1 = new File("./FolderC");
		
		if(!folder1.exists()) {
			folder1.mkdir();
			System.out.println("folder got created");
		}else {
			System.out.println("folder already exists, hence not created again");
		}
		
		//Create the folder
//		if(folder1.mkdir()) {
//			System.out.println("folder got created");
//		}else {
//			System.out.println("folder is not created");
//		}
		
	}

}

