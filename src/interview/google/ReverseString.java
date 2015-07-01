package interview.google;

public class ReverseString {
	public String reverseString2(String str) {
		if (str == null) 
			return str;
		StringBuilder sbuilder = new StringBuilder(str);
		return sbuilder.reverse().toString();
	}
	public String reverseString3(String str) {
		if (str == null) 
			return str;
		StringBuilder sbuilder = new StringBuilder();
		for (int i = str.length()-1; i >= 0; i--) {
			sbuilder.append(str.charAt(i));
		}
		return sbuilder.toString();
	}
	public char[] reverseString(char[] str) {
		if (str == null) 
			return str;
		for (int i = 0; i < str.length/2; i++) {
			char temp = str[i];
			str[i] = str[str.length-1-i];
			str[str.length-1-i] = temp;
		}
		return str;
	}
	public static void main(String[] args) {
		String str = "Hello World";
		ReverseString test = new ReverseString();
		System.out.println(test.reverseString(str.toCharArray()));
	}
}
