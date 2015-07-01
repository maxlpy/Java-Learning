package interview.google;

public class Fibonachi {
	public void outputWithoutLoop(int n) {
		if (n == 0) {
			return;
		}	
		System.out.println(n);
		outputWithoutLoop(--n);
	}
	public static void main(String[] args) {
		Fibonachi test = new Fibonachi();
		test.outputWithoutLoop(10);
	}
}
