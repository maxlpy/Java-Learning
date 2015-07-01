package regexdemo;

public class RegexDemo01 {
	public static void main(String[] args) {
		String str = "12345678";
		char[] c = str.toCharArray();
		boolean flag = true;
		for (int i = 0; i < c.length; i++) {
			if (!(c[i] >= '0' && c[i] <= '9')) {
				flag = false;
				break;
			}
		}
		if (flag) 
			System.out.println("String is consist of digital number.");
		else
			System.out.println("String is not consist of digital number.");
	}
}
