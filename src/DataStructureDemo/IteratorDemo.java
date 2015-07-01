package DataStructureDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("C");
		arrayList.add("A");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");

		for(String s: arrayList)
			System.out.println(s);
		
		Iterator<String> item = arrayList.iterator();
		ListIterator<String> itel = arrayList.listIterator();
		
		while(itel.hasNext()) {
			System.out.print(itel.next() + " ");
		}
		System.out.println();
		System.out.println(arrayList);
		
		while(itel.hasPrevious()) {
//			itel.previous();
			itel.set("O");
			
			System.out.print(itel.previous() + "-");
		}
		System.out.println();
		System.out.println(arrayList);
	}
}
