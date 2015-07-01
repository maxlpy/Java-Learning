abstract class A {
	public String name;
	public A(String name) {
		this.name = name;
		System.out.println("~~~~~~~~~");
	}
	public String getName() {
		return this.name;
	}
	
	public abstract void fun();
}
class B extends A {
	public B(String name) {
		super(name);
		System.out.println("*********");
	}
	public void fun() {
		System.out.println("Hello World");
		System.out.println(super.getName());
	}
}
public class AbstactDemo {
	public static void main(String[] args) {
		B a = null;
		a = new B("ABC");
		a.fun();
	}
}
