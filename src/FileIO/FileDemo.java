package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileDemo {

	public void ByteStreams(String input, String output) throws IOException {
		FileInputStream in = new FileInputStream(input);  // Open a file, and in just has read method
		FileOutputStream out = new FileOutputStream(output);
		
		int str;
		while((str=in.read()) != -1) {
			out.write(str);
		}
		
		in.close();
		out.close();
	}
	
	public void FileReaderWriter(String input, String output) throws IOException {
		
		FileReader in = new FileReader(input); // Open a file, and in just has read method
		FileWriter out = new FileWriter(output);

		int c = 0;
		while((c=in.read()) != -1) {
			out.write(c);
		}
		in.close();
		out.close();
	}
	
	public void StandardStreams() throws IOException {
		InputStreamReader cin = new InputStreamReader(System.in);  // read from system.in
		System.out.println("Enter characters, 'q' to quit.");
		char[] buf = new char[5];
        int temp = 0;
        while((temp = cin.read(buf)) != -1) {
            System.out.print(new String(buf,0,temp));
        }
//		
		
		cin.close();
	}
	
	// This method is very useful
	public void BufferedTest(String output) throws IOException {
		String path = "input.txt"; 
	
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));  // fin/bin has readline method.
		BufferedReader fin = new BufferedReader(new FileReader(path));
		BufferedWriter bout = new BufferedWriter(new FileWriter(output));
		String line = bin.readLine();
		
		while(line!= null) {
			System.out.println(line);
			bout.write(line);
			bout.append("\n");
			bout.flush();
			line = bin.readLine();
		}
		bin.close();
		bout.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		
		String input = "input.txt";
		String output = "output.txt";
		FileDemo fileDemo = new FileDemo();
//		fileDemo.ByteStreams(input, output);
//		fileDemo.FileReaderWriter(input, output);
		fileDemo.StandardStreams();
//		fileDemo.fileStreamTest(input, output);
//		fileDemo.BufferedTest(output);
	}
}
