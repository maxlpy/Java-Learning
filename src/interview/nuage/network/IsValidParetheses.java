package interview.nuage.network;

import java.util.Stack;

public class IsValidParetheses {

	public boolean isValidParetheses(String str) {
		
		if (str == null) {
			return true;
		}
		Stack<Character> stack = new Stack<Character>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
				stack.push(str.charAt(i));
			} 
			if(str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {	
				if(!stack.isEmpty()) {
					c = stack.pop();
					if (c == '(' && (str.charAt(i) != ')')) {
						return false;
					}
					if (c == '[' && (str.charAt(i) != ']')) {
						return false;
					}
					if (c == '{' && (str.charAt(i) != '}')) {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}       
	public static void main(String[] args) {
		String str = "a(eee[])Xj";
		IsValidParetheses test = new IsValidParetheses();
		System.out.println(test.isValidParetheses(str));
	}
}


