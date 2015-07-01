package commonclassdemo;

import java.util.regex.Pattern;

public class PatternDemo {
	public static void main(String[] args) {
		String str = "a1b22c333d4444e55555f";
		Pattern pat = Pattern.compile("\\d+");
		String[] s = pat.split(str);
		for (String item: s)
			System.out.println(item);
		
		Pattern pat2 = Pattern.compile("[a-z]");
//		String[] s2 = pat2.split(str);
		String[] s2 = str.split("[a-z]");
		for (String item: s2)
			System.out.println(item);
	}
}
