package commonclassdemo;

public class SystemDemo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = null;
		for (int i = 0; i < 10000; i++)
			str += i;
		long stop = System.currentTimeMillis();
		System.gc();
		System.out.println(stop-start);
		
	}
}
