package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
	public static void main(String[] args) throws IOException {
//		File file1 = new File("/home/fred/Dropbox/Luna/MLDN_Java/doc");
//		File file2 = new File("/home/fred/Dropbox/Luna/MLDN_Java/input.txt");
		
		// use File.separator
		File file1 = new File(File.separator+"home"+File.separator+"fred"+File.separator+"Dropbox"+File.separator+"Luna"+File.separator+"MLDN_Java"+File.separator+"doc");
		File file2 = new File("/home/fred/Dropbox/Luna/MLDN_Java/input.txt");
		System.out.println(file1.isDirectory());
		System.out.println(file2.isFile());
	}
}
