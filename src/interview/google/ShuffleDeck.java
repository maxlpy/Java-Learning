package interview.google;

import java.util.Arrays;
import java.util.Random;

public class ShuffleDeck {
	/**
	 * @param arr
	 * @return
	 */
	public int[] shuffleDeck(int[] arr) {

		if (arr == null) 
			return arr;

		for (int i = 0; i < 54; i++) {
			Random rand = new Random();

		    // nextInt is normally exclusive of the top value,
		    // so add 1 to make it inclusive
		    int randomNum = rand.nextInt((53 - i) + 1) + i;
			int temp = arr[i];
			arr[i] = arr[randomNum];
			arr[randomNum] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = new int[54];
		for (int i = 0; i < 54; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		ShuffleDeck test = new ShuffleDeck();
		int[] res = test.shuffleDeck(arr);
		System.out.println(Arrays.toString(arr));
	}
}
