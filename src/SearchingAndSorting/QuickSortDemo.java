package SearchingAndSorting;

public class QuickSortDemo {
	// T(n) = T(k) + T(n-k-1) + cn.
	// Running time is nlog(n).
	public void quickSort(int[] arr, int l, int r) {
		if (l < r) {
			int pos = partition(arr, l, r);
			quickSort(arr, l, pos - 1);
			quickSort(arr, pos + 1, r);
		}
	}
	public int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i = l - 1;
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= pivot) {
				i = i + 1;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, r);
		return i+1;
	}
	public void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public static void main(String[] args) {
		QuickSortDemo demo = new QuickSortDemo();
		int[] array = {10, 7, 8, 9, 1, 5};
		demo.quickSort(array, 0, array.length - 1);
		for(int item: array) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
