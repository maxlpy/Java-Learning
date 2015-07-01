package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		File file = new File("output.txt"); // provide file path
		if (file.exists()) {
			file.delete();  // delete an existing file
		} else {
			file.createNewFile();  // create a new file
		}
		File file1 = new File("/home/fred/Dropbox/Luna/MLDN_Java/doc/doc1");
		file1.mkdirs();
	}
}
