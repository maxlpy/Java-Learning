package regexdemo;

public class RegexDemo02 {
	public static void main(String[] args) {
		String str = "12345678";
		if (str.matches("\\d+")) 
			System.out.println("String is consist of digital number.");
		else
			System.out.println("String is not consist of digital number.");
	}
}
