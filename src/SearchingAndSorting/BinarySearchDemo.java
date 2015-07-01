package SearchingAndSorting;
class Search {
	// Linearly search x in arr[].  If x is present then return its 
	// location,  otherwise return -1
	// Running time is O(n).
	public int linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == x) 
				return i;
		return -1;
	}
	
	// A recursive binary search function. It returns location of x in
	// given array arr[l..r] is present, otherwise -1.
	// Running time is T(n) = T(n/2) + c; T(n) = log(n).
	public int binarySearch(int[] arr, int l, int r, int x) {
		if (r >= 1) {
			int mid = (l + r)/2; 
			if (arr[mid] == x) 
				return mid;
			else if (arr[mid] > x) 
				binarySearch(arr, l, mid - 1, x);
			else
				binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}
	// A iterative binary search function. It returns location of x in
	// given array arr[l..r] if present, otherwise -1
	public int binarySearch2(int[] arr, int l, int r, int x) {
		while (l <= r) {
			int mid = (l + r)/2;
			if (arr[mid] == x) 
				return mid;
			else if (arr[mid] > x) 
				r = mid - 1;
			else {
				l = mid + 1;
			}
		}
		return -1;
	}
}

public class BinarySearchDemo {
	public static void main(String[] args) {
		int[] array = {1, 3, 6, 10, 20};
		Search search = new Search();
		int res1 = search.linearSearch(array, 6);
		int res2 = search.binarySearch(array, 0, array.length, 6);
		int res3 = search.binarySearch(array, 0, array.length, 6);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
}
