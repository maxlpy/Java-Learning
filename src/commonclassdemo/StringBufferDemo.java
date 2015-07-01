package commonclassdemo;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append(" World.");
		buf.insert(0, "Hello");
//		buf.charAt(index);
		System.out.println(buf.insert(1, 999));
		System.out.println(buf.indexOf("W"));
		System.out.println(buf.indexOf("W", 5));
		System.out.println(buf.charAt(1));
		System.out.println(buf.capacity());
		System.out.println(buf.reverse().reverse());
		System.out.println(buf.replace(1, 4, ""));
	}
}
