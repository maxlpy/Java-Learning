package DataStructureDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map hashMap = new HashMap();
		hashMap.put("aa", new Integer(100));
		hashMap.put("bb", 200);
		hashMap.put("cc", new Float(300.01));
		hashMap.put("Zara", new Double(3434.34));
	    hashMap.put("Mahnaz", new Double(123.22));
	    hashMap.put("Ayan", new Double(1378.00));
	    hashMap.put("Daisy", new Double(99.22));
	    hashMap.put("Qadir", new Double(-19.08));
	    
	    // use set to traveral hashMap's key and value
	    Set entrySet = hashMap.entrySet();
	    Iterator item = entrySet.iterator();
	    
	    while(item.hasNext()) {
	    	Map.Entry entry = (Map.Entry)item.next(); // cast set to Map.Entry to getKey and getValue
	    	System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	    
	    hashMap.put("aa", new Integer((Integer)hashMap.get("aa")+900));
	    System.out.println(hashMap.get("aa"));
	    
	    System.out.println(hashMap.keySet());
	}  
}
