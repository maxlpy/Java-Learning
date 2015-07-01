package DataStructureDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		List arrayList1 = new ArrayList();
		
		List linkedList = new LinkedList();
		List arrayList2 = new ArrayList();
		
		arrayList.add("qq");
		arrayList.add("ww");
		arrayList.add("ee");
		arrayList1.addAll(arrayList1);
		linkedList.add(arrayList);
		List arrayList3 = new ArrayList(arrayList);
		
		System.out.println(arrayList);
		
		Iterator<String> itel = arrayList.iterator();
		
		for(Iterator<String> itel1 = arrayList.iterator(); itel1.hasNext();)
			System.out.println(itel1.next());
		
		while(itel.hasNext())
			System.out.println(itel.next());
		
		for(String s: arrayList)
			System.out.println(s);
			
//		System.out.println(arrayList.subList(1, 3));
//		System.out.println(arrayList2.toArray(new String[] { "a", "b" }));  // can't run success ?
		
	}

}
