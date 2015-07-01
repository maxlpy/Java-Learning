package bufferdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDemo02 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("input.txt");
		File file2 = new File("output.txt");
		BufferedReader rbuf = new BufferedReader(new FileReader(file1));
		BufferedWriter wbuf = new BufferedWriter(new FileWriter(file2));
		String info = null;
		while ((info = rbuf.readLine()) != null) {
			wbuf.append(info).append("\n");
			System.out.println(info);
		}
		
		rbuf.close();
		wbuf.close();
	}
}
