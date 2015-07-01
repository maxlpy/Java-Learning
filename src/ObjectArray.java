
public class ObjectArray {
	public static void main(String[] args) {
		// Object array, now each per is null. Because Person is just a data style
		Person[] per = new Person[3];  
		
		for(Person temp: per)
			System.out.println(temp);
		per[0] = new Person("Fred1", 20);
		per[1] = new Person("Fred2", 21);
		per[2] = new Person("Fred3", 22);
		
		
	}
}
