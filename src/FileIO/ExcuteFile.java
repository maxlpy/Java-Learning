package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExcuteFile {

	public static void main(String[] args) throws IOException {
		
		String path = File.separator + "home" + File.separator+ "fred" + File.separator + "java";
		File file = new File(path, "java1.txt");  // create a new file if "filename" is not existed.
		File dir = new File(path, "/test"); // create a directory
		System.out.println(file);
		System.out.println(dir);
		FileWriter fw = new FileWriter(file);
		fw.write("open file test1");
		fw.flush();
		FileReader fr = new FileReader(file);
		BufferedReader bufread = new BufferedReader(fr);
		System.out.println(bufread.readLine());
		
		fw.close();
		fr.close();
		file.delete();  // delete file
		dir.delete();	// delete directory
	}
}
