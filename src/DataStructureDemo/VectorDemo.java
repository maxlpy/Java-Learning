package DataStructureDemo;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("ee");
		vector.add("bb");
		vector.add("aa");
		
		vector.set(1, "ff");
		vector.setElementAt("gg", 2);
		
//		Iterator itel = vector.iterator();
//		while(itel.hasNext())
//			System.out.println(itel.next());
//		
//		for(Iterator item = vector.iterator(); item.hasNext();)
//			System.out.println(item.next());
//		
		for(String s: vector)
			System.out.println(s);
		System.out.println(vector);
	}
}
