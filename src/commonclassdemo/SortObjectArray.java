package commonclassdemo;

import java.util.Arrays;

class Person implements Comparable<Person> {
	private String name;
	
	private int age;
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + " age=" + age;
	}
	public int compareTo1(Person o) {
		if (this.age > o.age)
			return 1;
		else if (this.age < o.age)
			return -1;
		else
			return 0;
	}
	public int compareTo2(Person o) {
		int ret = this.name.compareTo(o.name);
		if (ret > 0)
			return 1;
		else if (ret < 0)
			return -1;
		else
			return 0;
	}
	public int compareTo(Person o) {
		if (this.age > o.age)
			return 1;
		else if (this.age < o.age)
			return -1;
		else {
			int ret = this.name.compareTo(o.name);  // compare two strings
			if (ret > 0)
				return 1;
			else if (ret < 0)
				return -1;
			else
				return 0;
		}
	}
	
	
}
public class SortObjectArray {
	public static void main(String[] args) {
		Person[] per = {new Person("Fred", 26), new Person("Gindy", 24), new Person("Eric", 25), new Person("Divid", 24)};
		Arrays.sort(per);
		System.out.println(Arrays.toString(per));
	}
}
