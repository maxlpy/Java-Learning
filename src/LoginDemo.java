class Operation {
	private String[] args;
	
	Operation(String[] str) {
		this.args = str;
		if (args.length != 2) {
			System.out.println("Wrong variables");
			System.exit(1);
		}
	}
	public String getInfo() {
		if(new Login(this.args[0], this.args[1]).isValid())
			return "Login success";
		else
			return "Wrong name or email";
	}
} 
class Login {
	private String name;
	private String password;
	Login(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public boolean isValid() {
		if(name.equals("abc") && password.equals("123"))
			return true;
		else 
			return false;
	}
}
public class LoginDemo {
	public static void main(String[] args) {
		System.out.println(new Operation(args).getInfo());
	}
}
