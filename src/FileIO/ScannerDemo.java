package FileIO;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();  // read a line from system.in
		System.out.println(str);
		
		System.out.print("Enter an index: ");
        int index = in.nextInt();

        System.out.print("Enter a sentence: ");
        String sentence = in.next();

        System.out.println("\nYour sentence: " + sentence);
        System.out.println("Your index: " + index);
		
	}
}
