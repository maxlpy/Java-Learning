package systemdemo;

public class SystemErrDemo {
	public static void main(String[] args) {
		try {
			Integer.parseInt("A");
		} catch (NumberFormatException e) {
			System.err.println(e);
			System.out.println(e);
		}
	}
}
