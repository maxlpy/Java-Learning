package DataStructureDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List list = new LinkedList();
		
		list.add(new Integer(8));
		list.add(new Integer(20));
		list.add(new Integer(-20));
		list.add(new Integer(-8));
		
		Collections.sort(list);
		System.out.println(list);
		
		// Sort list by using the comparator
		Comparator r = Collections.reverseOrder();
		Collections.sort(list, r);
		System.out.println(list);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(Collections.singletonList(list));
		System.out.println(Collections.singletonMap(list, list));
		
		Collections.fill(list, new Integer(100));
		Collections.shuffle(list);
		System.out.println(list); // display randomized list
		
		System.out.println(Collections.unmodifiableList(list));
	}
}
