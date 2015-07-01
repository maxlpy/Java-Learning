package DataStructureDemo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable hashTable = new Hashtable();
		Enumeration names;
	    hashTable.put("Zara", new Double(3434.34));
	    hashTable.put("Mahnaz", new Double(123.22));
	    hashTable.put("Ayan", new Double(1378.00));
	    hashTable.put("Daisy", new Double(99.22));
	    hashTable.put("Qadir", new Double(-19.08));
	    
	    names = hashTable.elements();
	    names = hashTable.keys();
	    while(names.hasMoreElements())
	    	System.out.println(names.nextElement());
	    
	    Set set = hashTable.entrySet();
	    Iterator item = set.iterator();
	    while(item.hasNext()) {
	    	Map.Entry entry = (Map.Entry)item.next();
	    	System.out.println(entry.getKey() +": "+ entry.getValue());
	    }
	    System.out.println(hashTable.keys());
	}
}
