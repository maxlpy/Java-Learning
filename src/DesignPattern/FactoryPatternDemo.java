package DesignPattern;

interface Fruit{
	void eat();
}
class Orange implements Fruit {
	public void eat() {
		System.out.println("Eat Orange");
	}
}
class Pear implements Fruit {
	public void eat() {
		System.out.println("Eat Pear");
	}
}
class Factory {
	public void getFruit(String str) {
		if("Orange".equals(str)) {
			Fruit f = new Orange();
			f.eat();
		}
		if("Pear".equals(str)) {
			Fruit f = new Pear();
			f.eat();
		}
		else
			System.out.println("Please input a kind of fruit:");
	}
}

public class FactoryPatternDemo {
	public static void main(String[] args) {
		Factory f = new Factory();
		String str = "Pear";
		f.getFruit(str);
	}
}
