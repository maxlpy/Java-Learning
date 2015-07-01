package classconllectiondemo;

import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo01 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("F");
		set.add("E");
		set.add("A");
		
		System.out.println(set);
	}
}
