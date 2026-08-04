package filehandlingpack;

import java.io.File;

public class DemoE {

	public static void main(String[] args) {
		
		//Shortcut way of representing files in Java - Way one
		File file1 = new File("files/mno.txt");
		System.out.println(file1.exists());
		
		//Shortcut way of representing files in Java - Way two
		File file2 = new File("./files/qrs.txt");
		System.out.println(file2.exists());
		
		//Shortcut way of representing files in Java - Way three
		File file3 = new File(System.getProperty("user.dir")+"/files/ode.txt");
		System.out.println(file3.exists());
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.dir")+"/files/ode.txt");
		
	}

}
