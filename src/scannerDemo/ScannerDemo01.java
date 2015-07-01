package scannerDemo;

import java.util.Scanner;

public class ScannerDemo01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		byte i = 0;
		if (scan.hasNextByte()) {
			i = scan.nextByte();
		}
		System.out.println(i);
	}
}
