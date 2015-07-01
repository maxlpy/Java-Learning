package DataStructureDemo;

import java.util.Iterator;
import java.util.Stack;

// http://blog.csdn.net/itlwc/article/details/10148321

public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		
		stack.add("a");
		stack.push("a");
//		stack.pop();
		System.out.println(stack.search(1));
		System.out.println(stack.search("a"));
		
		
		Iterator item = stack.iterator();
		while(item.hasNext())
			System.out.println(item.next());
	}
}
