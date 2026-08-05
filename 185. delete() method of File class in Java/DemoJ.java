package filehandlingpack;

import java.io.File;

public class DemoJ {

	public static void main(String[] args) {
		
		File file1 = new File("./abc.txt");
		
		if(file1.delete()) {
			System.out.println("File1 got deleted");
		}else {
			System.out.println("File1 didn't get deleted");
		}
		
		File folder1 = new File("./FolderA");
		
		if(folder1.delete()) {
			System.out.println("Folder1 got deleted");
		}else {
			System.out.println("Folder1 didn't get deleted");
		}
		
		File folder2 = new File("./FolderE");
		
		if(folder2.delete()) {
			System.out.println("Folder2 got deleted");
		}else {
			System.out.println("Folder2 didn't get deleted");
		}

	}

}
