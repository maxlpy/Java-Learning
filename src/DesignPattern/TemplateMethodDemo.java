package DesignPattern;
abstract class CaffeineBeverage {
	// 申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	abstract void brew();
	abstract void addCondiments();
	void boilWater() {
		System.out.println("Boiling water...");
	}
	void pourInCup() {
		System.out.println("Pouring into Cup...");
	}
}
class Coffee extends CaffeineBeverage {
	void addCondiments() {
		System.out.println("Adding sugar and milk...");
	}
	void brew() {
		System.out.println("Dripping Coffe through filter...");
	}
}
class Tea extends CaffeineBeverage {
	void addCondiments() {
		System.out.println("Adding lemon...");
	}
	void brew() {
		System.out.println("Steeping the tea...");
	}
}
public class TemplateMethodDemo {
	public static void main(String[] args) {
		Tea tea = new Tea();
		tea.prepareRecipe();
	}
}
