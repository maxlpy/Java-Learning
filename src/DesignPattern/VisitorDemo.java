package DesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class Visitor {
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public abstract void visitor(MedicineA a);
	public abstract void visitor(MedicineB b);
}
class Charger extends Visitor {
	public void visitor(MedicineA a) {
		System.out.println("Charger:" + name + "Give Medicine:" + a.getName() + "Price:" + a.getPrice());
	}
	public void visitor(MedicineB b) {
		System.out.println("Charger:" + name + "Give Medicine:" + b.getName() + "Price:" + b.getPrice());
	}
}
class WorkerOfPharmacy extends Visitor {
	public void visitor(MedicineA a) {
		System.out.println("Worker:" + name + "Get Medicine:" + a.getName());
	}
	public void visitor(MedicineB b) {
		System.out.println("Worker:" + name + "Get Medicine:" + b.getName());
	}
}
abstract class Medicine {
	protected String name;
	protected double price;
	
	public Medicine(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public abstract void accept(Visitor visitor);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
class MedicineA extends Medicine {
	public MedicineA(String name, double price) {
		super(name, price);
	}
	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}
}
class MedicineB extends Medicine {
	public MedicineB(String name, double price) {
		super(name, price);
	}
	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}
}
class Presciption {
	List<Medicine> list = new ArrayList<Medicine>();
	
	@SuppressWarnings("unchecked")
	public void accept(Visitor visitor) {
		Iterator<Medicine> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
	}
	public void addMedicine(Medicine medicine) {
		list.add(medicine);
	}
	public void removeMedicine(Medicine medicine) {
		list.remove(medicine);
	}
}
public class VisitorDemo {
	public static void main(String[] args) {
		Medicine a = new MedicineA("板蓝根", 11.0);
        Medicine b = new MedicineB("感康", 14.3);
        
        Presciption presciption = new Presciption();
        presciption.addMedicine(a);
        presciption.addMedicine(b);
        
        Visitor charger = new Charger();
        charger.setName("张三");
        
        Visitor workerOfPharmacy = new WorkerOfPharmacy();
        workerOfPharmacy.setName("李四");
        
        presciption.accept(charger);
        System.out.println("-------------------------------------");
        presciption.accept(workerOfPharmacy);
    }
}
