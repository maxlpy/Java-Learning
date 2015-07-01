package commonclassdemo;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] temp = {50, 45, 53, 90, 5, 12, 87};
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		
		Arrays.fill(temp, 100);
		Arrays.binarySearch(temp, 5);
		for (int item: temp) {
			System.out.print(item + ", ");
		}
	}
}
