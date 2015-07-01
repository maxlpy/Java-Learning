package DesignPattern;
class Memento {
	private int bloodFlow;
	private int magicPoint;
	
	public Memento(int bloodFlow, int magicPoint) {
		this.bloodFlow = bloodFlow;
		this.magicPoint = magicPoint;
	}

	public int getBloodFlow() {
		return bloodFlow;
	}

	public void setBloodFlow(int bloodFlow) {
		this.bloodFlow = bloodFlow;
	}

	public int getMagicPoint() {
		return magicPoint;
	}

	public void setMagicPoint(int magicPoint) {
		this.magicPoint = magicPoint;
	}
}
class Role {
	private int bloodFlow;
	private int magicPoint;
	
	public Role(int bloodFlow, int magicPoint) {
		this.bloodFlow = bloodFlow;
		this.magicPoint = magicPoint;
	}
	
	public void display() {
		System.out.println("Current user status:");
		System.out.println("Blood:" + getBloodFlow() + "; Magic:" + getMagicPoint());
	}
	public Memento saveMemento() {
		return new Memento(getBloodFlow(), getMagicPoint());
	}
	public void restoreMemento(Memento memento) {
		setBloodFlow(memento.getBloodFlow());
		setMagicPoint(memento.getMagicPoint());
	}

	public int getBloodFlow() {
		return bloodFlow;
	}

	public void setBloodFlow(int bloodFlow) {
		this.bloodFlow = bloodFlow;
	}

	public int getMagicPoint() {
		return magicPoint;
	}

	public void setMagicPoint(int magicPoint) {
		this.magicPoint = magicPoint;
	}
}
class CareTaker {
	Memento memento;
	public CareTaker(Memento memento) {
		this.memento = memento;
	}
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
public class MementoDemo {
	public static void main(String[] args) {
		Role role = new Role(100, 100);
		CareTaker careTaker = new CareTaker(role.saveMemento());
		
		role.setBloodFlow(20);
		role.setMagicPoint(20);
		role.display();
		role.restoreMemento(careTaker.memento);
		role.display();
	}
}
