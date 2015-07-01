package readerdemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo01 {
	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");
		Reader in = new FileReader(file);
		char[] data = new char[1024];
		in.read(data);
		System.out.println(new String(data));
		in.close();
	}
}
