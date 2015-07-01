package systemdemo;

import java.io.IOException;
import java.io.InputStream;

public class SystemOutDemo01 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		byte[] data = new byte[5];
		int len = in.read(data);
		System.out.println(new String(data));
	}
}
