class Dog {
	private String name;
	private int age;
	Dog () {
		System.out.println("Zero Zero");
	}
	// This() and This(name) must be located in the first line of a constructor. 
	// At least one constructor has no this() method. Usually Dog() has no this() method inside it.
	Dog(String name) {
		this();   // Call Dog();
		this.name = name;
		System.out.println("One One");
	}
	Dog(String name, int age) {
		this(name);  // Call Dog(String name)
		this.name = name;
		this.age = age;
//		System.out.println("Two Two");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
public class ThisDemo {
	public static void main(String[] args) {
		Dog dog = new Dog("Abao", 2);
//		Dog dog1 = new Dog();
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
	}
}
