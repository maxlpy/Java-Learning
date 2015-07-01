package DataStructureDemo;

public class StringsDemo {

	public static void main(String[] args) {
		
		String str1 = "NCS U ";
		String str2 = "Duke";
		String str3 = "UNC";
		
		System.out.println(str1.charAt(1));
		System.out.println(str1.codePointAt(0));
		System.out.println(str1.compareTo(str2));  //0: equal; 10: <; -10: >
		System.out.println(str1.contains("CS"));
		System.out.println(str1.contentEquals("NCSU"));
		System.out.println(str1.endsWith("S"));
		System.out.println(str1.equalsIgnoreCase("ncsu"));
		System.out.println(str1.intern());
		System.out.println(str1.matches("NCSU"));
		System.out.println(str1.replace("N", "VSS"));
		System.out.println(str1.trim());
	}
}
