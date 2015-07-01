package DataStructureDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap treeMap = new TreeMap();
		
		// Put elements to the map
		treeMap.put("Zara", new Double(3434.34));
		treeMap.put("Mahnaz", new Double(123.22));
		treeMap.put("Ayan", new Double(1378.00));
		treeMap.put("Daisy", new Double(99.22));
		treeMap.put("Qadir", new Double(-19.08));
		treeMap.remove("Qadir");
		
//		treeMap.comparator();
		
		System.out.println(treeMap);
//		System.out.println(treeMap.get("Zara"));
//		System.out.println(treeMap.firstKey());
//		System.out.println(treeMap.lowerKey("Mahnaz"));
//		System.out.println(treeMap.higherKey("Mahnaz"));
//		System.out.println(treeMap.lastKey());
		System.out.println(treeMap.ceilingKey("Daisy"));
		System.out.println(treeMap.floorKey("Daisy"));
		System.out.println(treeMap.keySet());
		System.out.println(treeMap.values());
		
		System.out.println(treeMap.comparator());
		System.out.println(treeMap.subMap("Ayan",false, "Zara",true));
		System.out.println(treeMap.tailMap("Mahnaz", true));
		System.out.println(treeMap.headMap("Mahnaz", true));
		
		Set set = treeMap.entrySet();
		Iterator item = set.iterator();
		while(item.hasNext()) {
			Map.Entry entry = (Map.Entry)item.next();
			System.out.println(entry.getKey() + " ++ " + entry.getValue());
		}
	}
}
