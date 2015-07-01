package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		// use File.separator
		File file1 = new File(File.separator+"home"+File.separator+"fred"+File.separator+"Dropbox"+File.separator+"Luna"+File.separator+"MLDN_Java"+File.separator+"doc");
		
		// list all files in doc
		if (file1.isDirectory()) {
			String[] list = file1.list();
			for (String str: list) {
				System.out.println(str);
			}
		}
		
		// output pathnames of the file
		if (file1.isDirectory()) {
			File[] list = file1.listFiles();
			for (File str: list) {
				System.out.println(str);
			}
		}
	}
}
