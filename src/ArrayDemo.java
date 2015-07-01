import java.util.Arrays;

class Array {
	private int[] array = null;
	private int foot = 0;
	
	Array(int len) {
		if (len > 0)
			array = new int[len];
		else 
			array = new int[1];
	}
	public boolean add(int i) {
		if (foot < array.length) {
			array[foot] = i;
			foot++;
			return true;
		}
		else
			return false;
	}
	public int[] getArray() {
		return this.array;
	}
}
class SortArray extends Array {

	SortArray(int len) {
		super(len);
	}
	public int[] getArray() {
		Arrays.sort(super.getArray());
		return super.getArray();
	}
}
class ReverseArray extends Array {
	ReverseArray(int len) {
		super(len);
	}
	
	public int[] getArray() {
		int[] array = super.getArray();
		for(int i = 0; i <= array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}
}

public class ArrayDemo {
	public static void main(String[] args) {
//		Array array = new Array(5);
//		SortArray array = new SortArray(5);
		ReverseArray array = new ReverseArray(5);
		array.add(1);
		array.add(6);
		array.add(3);
		
		for(int a: array.getArray())
			System.out.print(a + " ");
	}
}
