package DataStructureDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet treeSet = new TreeSet();
		Set treeSet2 = new TreeSet();
		treeSet.add("D");
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("A");
		
		Set treeSet1 = new TreeSet(treeSet);
		treeSet2.addAll(treeSet);
		treeSet.comparator();
		
		System.out.println(treeSet2);
	}
}
