package DataStructureDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> linkedList1 = new LinkedList<Integer>();
		List LinkedList3 = new LinkedList();
		
		LinkedList3.add(1);
		LinkedList3.add("a");
		
		linkedList1.add(1);
		linkedList1.add(2);
		((LinkedList<Integer>) linkedList1).addFirst(100);
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(0, 0);
		linkedList.add(4, 4);
		linkedList.addAll(linkedList1);
//		linkedList.addAll(2, linkedList);
		if (linkedList.containsAll(linkedList1))
			System.out.println(true);
		else 
			System.out.println(false);
		
		System.out.println(linkedList.getClass());
		System.out.println(linkedList);
		linkedList1 = linkedList;
		System.out.println(linkedList1.indexOf(100));
		System.out.println(linkedList1.lastIndexOf(2));
		
		linkedList.remove(1);
		linkedList.set(4, 200);
		System.out.println(linkedList);
		
		List<Integer> linkedList2 = new LinkedList<Integer>(linkedList);
		System.out.println(linkedList2);
		
		Iterator item = linkedList2.listIterator();
		while(item.hasNext())
			System.out.println(item.next());
	}
}
