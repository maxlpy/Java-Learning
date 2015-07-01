package DataStructureDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set hashSet = new HashSet();
		Set hashSet1 = new HashSet();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.addAll(hashSet);
//		hashSet.toArray();
		
		hashSet1.add("A");
		hashSet1.add("C");
		hashSet1.add("C");   // no repeat in set
		
		
		
//		System.out.println(hashSet.equals(hashSet1));
//		System.out.println(hashSet1.hashCode());
		System.out.println(hashSet.toArray());
		System.out.println(hashSet.hashCode());
	}
}
