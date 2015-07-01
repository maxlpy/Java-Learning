package classconllectiondemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.parser.Entity;


class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	Person(){}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
@Override
public int compareTo(Person o) {
	if (this.age > o.age)
		return -1;
	else if (this.age < o.age)
		return 1;
	else
		return 0;
}
	
	
}

public class TreeSetSortDemo {
	public static void main(String[] args) {
		Set<Person> set = new TreeSet<Person>();
		
		set.add(new Person("Fred", 26));
		set.add(new Person("Eric", 25));
		set.add(new Person("Divid", 24));
		set.add(new Person("Mickey", 24));
		
		System.out.println(set.toString());
	}
}
