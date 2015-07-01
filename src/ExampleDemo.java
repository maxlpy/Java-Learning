class Student1 {

	private String name;
	private int age;
	private float math;
	private float computer;
	private float english;
	
	public Student1() {}
	public Student1(String name, int age, float math, float computer, float english) {
		this.setName(name);
		this.setAge(age);
		this.setMath(math);
		this.setComputer(computer);
		this.setEnglish(english);
	}
	
	public float sum() {
		return this.math + this.computer + this.english;
	}
	public float avg() {
		return this.sum()/3;
	}
	public float maxScore() {
		float max = math > computer? math:computer;
		max = max > english? max:english;
		return max;
	}
	public float minScore() {
		float min = math < computer? math:computer;
		min = min < english? min:english;
		return min;
	}
	public String getInfo() {
		return "Student's information:" + "\n"
				+ "Name: " + this.getName() + "\n"
				+ "Age: " + this.getAge() + "\n"
				+ "Math: " + this.getMath() + "\n"
				+ "Computer: " + this.getComputer() + "\n"
				+ "English: " + this.getEnglish() +"\n"
				+ "Total: " + this.sum();
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
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getComputer() {
		return computer;
	}
	public void setComputer(float computer) {
		this.computer = computer;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
}
public class ExampleDemo {

	public static void main(String[] args) {
		
		Student1 student = new Student1("Fred",25,100l, 100l, 100l);
		System.out.println(student.getInfo());
	}
}
