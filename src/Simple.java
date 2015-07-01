
public class Simple {

	public static void main(String[] args) {
		Simple simple = new Simple();
		String str = "Hello";
		int i = 10;
		System.out.println(str + (i + 20));
		int a[] = new int[10];
		int[] a1 = new int[10];
		for(int x: a) {
			System.out.println(x);
		}
		simple.method(1);
		simple.method(1,3,4);
		simple.method(1);
	}
	
	public void method(int ...arg) {
		for (int x: arg)
			System.out.print(x + " ");
		System.out.println();
	}
}
