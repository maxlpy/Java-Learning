package bufferdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDemo01 {
	public static void main(String[] args) throws IOException {
		// InputStreamReader transfer byte into char
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String info = null;
		info = buf.readLine();
		System.out.println(info);
	}
}
