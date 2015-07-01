abstract class Person2 {
	private String name;
	private int age;
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if ( 0< this.age && this.age < 200)
			this.age = age;
	}
	public void say() {
		System.out.println(this.getContent());
	}
	public abstract String getContent();
}
class Student2 extends Person2 {
	private float score;
	
	Student2(String name, int age, float score) {
		super(name, age);
		this.score = score;
	}
	
	public float getScore() {
		return this.score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getContent() {
		return this.getName() + " " + this.getAge() + " " + this.score;
	}
}
class Worker2 extends Person2 {
	private double salary;
	
	Worker2(String name, int age, double salary) {
		super(name, age);
		this.setSalary(salary);
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getContent() {
		return this.getName() + " " + this.getAge() + " " + this.salary;
	}
}
public class AbstractDemo2 {
	public static void main(String[] args) {
//		Person2 student = new Student2("Fred", 25, 100);
		Student2 student = new Student2("Fred", 25, 100);
		Person2 worker = new Worker2("Bob", 30, 10000);
		student.say();
		worker.say();
	}
}
