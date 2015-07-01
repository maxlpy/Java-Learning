package DataStructureDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryDemo {

	public static void main(String[] args) {
		
		// Create a hash map
	      HashMap hm = new HashMap();
	      // Put elements to the map
	      hm.put("Zara", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      
	      Set set = hm.entrySet();
	      Iterator item = set.iterator();
	      
	      while(item.hasNext()) {
	    	  Map.Entry entry = (Map.Entry)item.next();
	    	  System.out.println(entry.getKey() + ": " + entry.getValue());
	      }
	}
}
