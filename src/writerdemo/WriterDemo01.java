package writerdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo01 {
	public static void main(String[] args) throws IOException {
		File file = new File("output.txt");
		Writer out = new FileWriter(file);
		String str = "Hello World.";
		out.write(str);
		out.close();
	}
}
