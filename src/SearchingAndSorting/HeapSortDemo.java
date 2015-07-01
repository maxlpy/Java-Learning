package SearchingAndSorting;

public class HeapSortDemo {
	public int parent(int i) {
		return i/2;
	}
	public int left(int i) {
		return 2*i ;
	}
	public int right(int i) {
		return 2*i + 1;
	}
	
	public void heapSort(int[] arr) {
		buildMaxHeap(arr);
		int len = arr.length;
		for (int i = len; i>2; i--) {
			swap(arr, i-1, 0);
			len = len - 1;
			maxHeapfy(arr, 1);
		}
	}
	
	public void buildMaxHeap(int[] arr) {
		int heapSize = arr.length;
		
		for (int i = heapSize/2; i > 0; i--) 
			maxHeapfy(arr, i);
	}
	
	public void maxHeapfy(int[] arr, int i) {
		int l = left(i);
		int r = right(i);
		int largest = i;
		
		if (l <= arr.length && arr[l-1] > arr[i-1])
			largest = l;

		if (r <= arr.length && arr[r-1] > arr[largest-1])
			largest = r;
		
		if (largest != i) {
			swap(arr, i-1, largest-1);
			maxHeapfy(arr, largest);
		}
	}
	public void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {4,1,3,2,16,9};
		HeapSortDemo demo = new HeapSortDemo();
//		demo.buildMaxHeap(array);
		demo.heapSort(array);
		for (int item: array)
			System.out.print(item + " ");
		System.out.println();
	}
}
