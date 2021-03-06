package inputstreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");
		InputStream input = new FileInputStream(file);
		byte[] data = new byte[1024];
		int len = input.read(data);  // read all data from file once
		
		System.out.println(new String(data, 0, len));
	}
}
