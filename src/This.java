
class Person1 {
	private String name;
	private int age;
	Person1(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	public boolean compareTo(Person1 per2) {
		if(this.name.equals(per2.getName()) && this.age == per2.getAge())
			return true;
		else return false;
	}
	
	void print() {
		System.out.println(this);
	}
	
	public void fun(Person1 temp) {
		temp.name = "Cindy";
		temp.age = 20;
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
}

public class This {
	public static void main(String[] args) {
		Person1 per1 = new Person1("Fred", 22);
		Person1 per2 = new Person1("Fred", 21);
		if(per1.compareTo(per2))
			System.out.println("True");
		else 
			System.out.println("False");
		per1.fun(per1);
		System.out.println(per1.getName());
		System.out.println(per1.getAge());
		
	}
}
