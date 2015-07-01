package classconllectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo02 {
	public static void main(String[] args) {
		Collection<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("world");
		all.add("!!!");
		all.remove("!!!");
		
		for (String item: all)
			System.out.println(item);
		
		Object[] obj = all.toArray();
		for (int i = 0; i < obj.length; i++)
			System.out.println(obj[i]);
		
		String[] str = all.toArray(new String[] {});
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}
}
