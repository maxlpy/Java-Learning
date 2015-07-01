package DesignPattern;
class Singleton {
	private static Singleton uniqueSingleton;
	
	private Singleton() {
		
	}
	public static Singleton getSingleton() {
		if(uniqueSingleton == null) {
			uniqueSingleton = new Singleton();
		}
		return uniqueSingleton;
	}
}
public class SingletonDemo {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
	}
}
