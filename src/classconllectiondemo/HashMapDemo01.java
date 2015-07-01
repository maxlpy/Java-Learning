package classconllectiondemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("BJ", 10);
		map.put("SH", 21);
		map.put("SX", 25);
		
		System.out.println(map);
		System.out.println(map.get("BJ"));
		System.out.println(map.containsKey("SH"));
		System.out.println(map.containsValue(21));
		
		Set<String> key = map.keySet();  // get all keys
		Iterator<String> item = key.iterator();
		while (item.hasNext())
			System.out.println(item.next());
		
		Collection<Integer> value = map.values();  // get all values
		System.out.println(value);
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();  // output all entry and each items
		Iterator<Map.Entry<String, Integer>> iter = entry.iterator();
		while (iter.hasNext()) {
			Map.Entry<String, Integer> me = iter.next();
			System.out.println(me.getKey() + "->" + me.getValue());
		}
	}
}
