package scannerDemo;

import java.text.ParseException;
import java.util.Scanner;

public class ScannerDemo03 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		
		String str = null;
		if (scan.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
			str = scan.next("\\d{4}-\\d{2}-\\d{2}");
		}
		
		System.out.println(str);
	}
}
