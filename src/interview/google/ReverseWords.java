package interview.google;

public class ReverseWords {
	public void reverseWords(String[] strs) {
		if (strs == null || strs.length == 0) {
			return;
		}
		int len = strs.length;
		int i = 0; 
		while (i < len/2) {
			String temp = strs[i];
			strs[i] = strs[len-1-i];
			strs[len-1-i] = temp;
			i++;
		}
	}
	public static void main(String[] args) {
//		String[] strs = {"qq", "ww", "ee", "rr", "tt"};
		String strstr = "qq ww ee rr tt";
		String[] strstr1 = strstr.split(" ");
		
		ReverseWords test = new ReverseWords();
		test.reverseWords(strstr1);
		for (String s: strstr1) {
			System.out.println(s);
		}
//		for (int i = 0; i < strs.length; i++) {
//			System.out.println(strs[i]);
//		}
		System.out.println("Test");
	}
}
