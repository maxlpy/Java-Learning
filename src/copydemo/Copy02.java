package copydemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Copy02 {  // use FileReader and FileWriter method
	public static void main(String[] args) throws IOException {
		File file1 = new File("input.txt");
		File file2 = new File("output.txt");
		
		Reader in = new FileReader(file1);
		Writer out = new FileWriter(file2);
		if (file1.exists()) {
			int temp = 0;
			while ((temp = in.read()) != -1) 
				out.write(temp);
		}
		in.close();
		out.close();
		System.out.println("Finished.");
	}
}
