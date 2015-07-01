package systemdemo;

import java.io.IOException;
import java.io.OutputStream;

public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write("helloworld".getBytes());
	}
}
