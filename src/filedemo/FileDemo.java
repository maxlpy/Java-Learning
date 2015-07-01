package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		// use File.separator
		File file1 = new File(File.separator+"home"+File.separator+"fred"+File.separator+"Dropbox"+File.separator+"Luna"+File.separator+"MLDN_Java"+File.separator+"doc");
		list(file1);
	}
	// list all files and directories in a directory
	public static void list(File file) {
		System.out.println(file);
		if (file.isDirectory()) {
			File[] list = file.listFiles();
			for (File f: list) 
				list(f);
		}
	}
}
