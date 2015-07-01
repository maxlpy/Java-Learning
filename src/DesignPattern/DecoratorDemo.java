package DesignPattern;


abstract class Beverage {
	protected String description = "Unknow Beverage";
	public String getDescription() {
		return this.description;
	}
	public abstract double cost();
}
class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "HouseBlend";
	}
	public double cost() {
		return 0.89;
	}
}
class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "DarkRoast";
	}
	public double cost() {
		return 1.05;
	}
}
class Decat extends Beverage {
	public Decat() {
		description = "Decat";
	}
	public double cost() {
		return 0.99;
	}
}
abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
class Milk extends CondimentDecorator {
	Beverage beverage;
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
	@Override
	public double cost() {
		return beverage.cost() + 0.3;
	}
}
class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	public double cost() {
		return beverage.cost() + 0.2;
	}
}
public class DecoratorDemo {
	public static void main(String[] args) {
		Beverage beverage = new HouseBlend();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
