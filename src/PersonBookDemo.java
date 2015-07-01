class Person {
	private String name;
	private int age;
	private Book book;
	private Person child;
//	Person() {}
	Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	public Person getChild() {
		return child;
	}
	public void setChild(Person child) {
		this.child = child;
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
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}

class Book {
	private String title;
	private double price;
	private Person person;
	Book(String t, double d) {
		this.setTitle(t);
		this.setPrice(d);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
public class PersonBookDemo {
	public static void main(String[] args) {
		Person person = new Person("Fred", 26);
		Person child = new Person("Lucy", 5);
		Book book = new Book("Think in Java", 99.99);
		Book childBook = new Book("Dog Story", 12.99);
		person.setBook(book);
		person.setChild(child);
		book.setPerson(person);
		childBook.setPerson(child);
		
		System.out.println(person.getBook().getTitle());
		System.out.println(book.getPerson().getName());
		System.out.println(person.getChild().getName());
		System.out.println(childBook.getPerson().getName());
	}
}
