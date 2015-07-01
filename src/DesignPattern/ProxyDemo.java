package DesignPattern;
interface Give {
	public void giveMoney();
}
class RealGive implements Give {
	public void giveMoney() {
		System.out.println("Return money");
	}
}
class ProxyGive implements Give {
	private Give give = null;
	public ProxyGive(Give give) {
		this.give = give;
	}
	public void before() {
		System.out.println("Prepare");
	}
	public void giveMoney() {
		this.before();
		this.give.giveMoney();
		this.after();
	}
	public void after() {
		 System.out.println("Delete");
	}
}

public class ProxyDemo {
	public static void main(String[] args) {
		Give give = new ProxyGive(new RealGive());
		give.giveMoney();
	}
}
