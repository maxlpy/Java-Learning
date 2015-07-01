
public class StringDemo {
	public static void main(String[] args) {
		// Two methods to instance a string object.
		String str1 = "Hello";  // Assign a string to str1
		String str2 = new String("Hello"); // Use construct method
		String str3 = str2;
		// "==" compare two strings's address
		System.out.println("str1==str2 " + (str1==str2));
		System.out.println("str1==str3 " + (str1==str3));
		System.out.println("str2==str3 " + (str2==str3));
		// equals method compare string's content
		System.out.println("str1==str2 " + (str1.equals(str2)));
		System.out.println("str1==str3 " + (str1.equals(str3)));
		System.out.println("str2==str3 " + (str2.equals(str3)));
		
		System.out.println("Hello".equals(str1));
		
		// Change between string and char
		char[] c = str1.toCharArray();
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i]+", ");
		
		System.out.println();
		String str4 = new String(c);
		String str5 = new String(c, 2, 2);
		System.out.println(str4);
		System.out.println(str5);
		// Cast string to byte
		byte[] b = str1.getBytes();
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i]+" ");
		
		System.out.println();
		String str6 = "  **NCSU##  ";
		System.out.println(str6.startsWith("**"));
		System.out.println(str6.endsWith("##"));
		System.out.println(str6.startsWith("N", 2));
		System.out.println(str6);
		System.out.println(str6.trim().toLowerCase()); // Omit white space in the begin and end of String.
	}
}
