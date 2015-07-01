package classconllectiondemo;

import java.util.HashSet;
import java.util.Set;

public class TreeSetDemo01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("hello");
		set.add("world");
		
		System.out.println(set);
	}
}
