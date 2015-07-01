package outputstreamdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		// find a file
		File file = new File("output.txt");
		OutputStream out = new FileOutputStream(file);
//		OutputStream out = new FileOutputStream(file, true); // append string to file
		String info = "Hello World!!\n";
		byte[] data = info.getBytes();
		out.write(data);
		out.close();
	}
}
