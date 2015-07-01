class OuterClass {
	private String name = "Hello World";
	class InnerClass {
		public void print() {
			System.out.println("name = " + name);
		}
	}
	
	public void fun() {
		new InnerClass().print();
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		out.fun();
		OuterClass.InnerClass in = out.new InnerClass();
		in.print();
	}
}
