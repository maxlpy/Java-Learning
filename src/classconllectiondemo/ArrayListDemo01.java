package classconllectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo01 {
	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("world");
		all.add("!!!");
		
		for (String item: all)
			System.out.println(item);
		for (int i = 0; i < all.size(); i++)
			System.out.println(all.get(i));
	}
}
