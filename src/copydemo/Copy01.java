package copydemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy01 { // use InputStream and OutputStream method
	public static void main(String[] args) throws IOException {
		File file1 = new File("input.txt");
		File file2 = new File("output.txt");
		
		InputStream input = new FileInputStream(file1);
		OutputStream output = new FileOutputStream(file2);
		
		if (file1.exists()) {
			int temp = 0;
			while ((temp = input.read()) != -1) 
				output.write(temp);
		}
		input.close();
		output.close();
		System.out.println("Finished.");
	}
}
