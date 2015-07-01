package scannerDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo04 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input.txt");
//		Scanner scan = new Scanner(new FileInputStream(file));
		Scanner scan = new Scanner(file);
		StringBuffer buf = new StringBuffer();
		scan.useDelimiter("\n");
		while (scan.hasNext()) {
			buf.append(scan.next()).append("\n");
		}
		System.out.println(buf);
	}
}
