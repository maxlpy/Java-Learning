package DesignPattern;

abstract class Mediator {
	public abstract void contact(String name, Person person);
}
abstract class Person {
	protected String name;
	protected Mediator mediator;
	
	Person(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
}

class HouseOwner extends Person {

	HouseOwner(String name, Mediator mediator) {
		super(name, mediator);
	}
	
	public void contact(String message) {
		mediator.contact(message, this);
	}
	public void getMessage(String message) {
		System.out.println("HouseOwner:" + name + ", getMessage:" + message);
	}
}
class Tenant extends Person {
	Tenant(String name, Mediator mediator) {
		super(name, mediator);
	}
	
	public void contact(String message) {
		mediator.contact(message, this);
	}
	public void getMessage(String message) {
		System.out.println("Tenant: " + name + ", getMessage:" + message);
	}
}
class MediatorStructure extends Mediator {
	private HouseOwner houseOwner;
	private Tenant tenant;
	
	public void contact(String message, Person person) {
		if(person == houseOwner) {
			tenant.getMessage(message);
		}
		else {
			houseOwner.getMessage(message);
		}
	}

	public HouseOwner getHouseOwner() {
		return houseOwner;
	}

	public void setHouseOwner(HouseOwner houseOwner) {
		this.houseOwner = houseOwner;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
}

public class MediatorDemo {
	public static void main(String[] args) {
		MediatorStructure mediator = new MediatorStructure();
		HouseOwner houseOwner = new HouseOwner("AA", mediator);
		Tenant tenant = new Tenant("BB", mediator);
		
		mediator.setHouseOwner(houseOwner);
		mediator.setTenant(tenant);
		
		tenant.contact("If you have a room to rent?");
		houseOwner.contact("Yes, do you want to rent?");
	}
}
