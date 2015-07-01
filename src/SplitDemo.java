
public class SplitDemo {
	public boolean isEmail(String str) {
		boolean flag = true;
		if(str.indexOf("@") == -1 || str.lastIndexOf(".") == -1)
			flag = false;
		if(!(str.indexOf("@") < str.lastIndexOf(".")))
			flag = false;
		
		return flag;
	}
	public static void main(String[] args) {

		// String example
		String str1 = "Tom:98|Fred:99|Ken:97";
		String[] strs = str1.split("\\|");
		for(String str: strs) {
			String[] s2 =  str.split(":");
			System.out.println(s2[0] + " --> " + s2[1]);
		}
		
		// Email address valid?
		String str2 = "max.lipengyu@gmail.com";
		SplitDemo temp = new SplitDemo();
		System.out.println(temp.isEmail(str2));
	}
}
