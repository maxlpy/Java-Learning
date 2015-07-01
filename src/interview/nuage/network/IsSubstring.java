package interview.nuage.network;

public class IsSubstring {
	// method1
	public boolean isSubstring(String str1, String str2) {

		if (str1 == null && str2 == null) {
			return true;
		}
		if (str1 == null && str2 != null) {
			return false;
		}
		if (str1 != null && str2 == null) {
			return true;
		}

		boolean res = str1.contains(str2);

		return res;
	}
	// method2
	public boolean isSubstring2(String str1, String str2) {

		if (str1 == null && str2 == null) {
			return true;
		}
		if (str1 == null && str2 != null) {
			return false;
		}
		if (str1 != null && str2 == null) {
			return true;
		}

		for (int i = 0; i < str1.length(); i++) {
			int count = 0;
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i+j) != str2.charAt(j)) {
					count = 0;
					break;
				} else {
					count++;
				}
			} 
			
			if (count == str2.length()) {
				return true;
			}
		}

		return false;
	}
	
	public static void main(String[] args) {
		String str1 = "abcdefghij";
		String str2 = "cdefk";
		IsSubstring test = new IsSubstring();
//		System.out.println(test.isSubstring(str1, str2));
//		System.out.println(str1.indexOf(str2));
		System.out.println(test.isSubstring2(str1, str2));
	} 
}
