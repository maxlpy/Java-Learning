package systemdemo;

import java.io.IOException;
import java.io.InputStream;

public class SystemOutDemo02 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		StringBuffer buf = new StringBuffer();
		int temp = 0;
		while ((temp = in.read()) != -1) {
			char c = (char) temp;
			if (c == '\n')
				break;
			buf.append(c);
		}
		System.out.println(buf);
	}
}
