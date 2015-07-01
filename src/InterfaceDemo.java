interface D {
	public static final String INFO = "China";
	public abstract void print();
	public abstract void fun();
}
class C implements D {
	public void print() {
		System.out.println("Hello Interface.");
	}
	public void fun() {
		System.out.println(INFO);
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		C b = new C();
		b.print();
		b.fun();
	}
}

