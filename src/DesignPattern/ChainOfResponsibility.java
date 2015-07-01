package DesignPattern;
class LeaveNode {
	private int number;
	private String name;
	
	public LeaveNode(String name, int number) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
abstract class Leader {
	public String name;
	protected Leader successor;
	
	public Leader(String name) {
		this.name = name;
	}
	public void setSuccessor(Leader successor) {
		this.successor = successor;
	}
	public abstract void handleRequest(LeaveNode leaveNode);
}
class Instructor extends Leader {
	public Instructor(String name) {
		super(name);
	}
	public void handleRequest(LeaveNode leaveNode) {
		if(leaveNode.getNumber() <= 3) {
			System.out.println("Instructor " + name + " agrees " + leaveNode.getName() + "'s leaveNode, and vacation number is " + leaveNode.getNumber() + " days.");
		}
		else {
			if(this.successor != null)
				this.successor.handleRequest(leaveNode);
		}
	}
}
class DepartmentHead extends Leader {
	public DepartmentHead(String name) {
		super(name);
	}
	public void handleRequest(LeaveNode leaveNode) {
		if(leaveNode.getNumber() <= 7) {
			System.out.println("DepartmentHead " + name + " agrees " + leaveNode.getName() + "'s leaveNode, and vacation number is " + leaveNode.getNumber() + " days.");
		}
		else {
			if(this.successor != null)
				this.successor.handleRequest(leaveNode);
		}
	}
}
class Dean extends Leader {
	public Dean(String name) {
		super(name);
	}
	public void handleRequest(LeaveNode leaveNode) {
		if(leaveNode.getNumber() <= 10) {
			System.out.println("Dean " + name + " agrees " + leaveNode.getName() + "'s leaveNode, and vacation number is " + leaveNode.getNumber() + " days.");
		}
		else {
			if(this.successor != null)
				this.successor.handleRequest(leaveNode);
		}
	}
}
class President extends Leader {
	public President(String name) {
		super(name);
	}
	public void handleRequest(LeaveNode leaveNode) {
		if(leaveNode.getNumber() <= 15) {
			System.out.println("President " + name + " agrees " + leaveNode.getName() + "'s leaveNode, and vacation number is " + leaveNode.getNumber() + " days.");
		}
		else {
			System.out.println("Can't agee with more than 15 days' vacation.");
		}
	}
}

public class ChainOfResponsibility {
	public static void main(String[] args) {
		Leader instructor = new Instructor("Qian Zhang");
		Leader dean = new Dean("Weirong Chen");
		Leader departmentHead = new DepartmentHead("Shibin Gao");
		Leader president = new President("Chunyang Chen");
		instructor.setSuccessor(dean);
		dean.setSuccessor(departmentHead);
		departmentHead.setSuccessor(president);
		
		//请假3天的请假条
        LeaveNode leaveNode1 = new LeaveNode("张三", 3);
        instructor.handleRequest(leaveNode1);     
        
        //请假9天的请假条
        LeaveNode leaveNode2 = new LeaveNode("李四", 9);
        instructor.handleRequest(leaveNode2);
        
        //请假15天的请假条
        LeaveNode leaveNode3 = new LeaveNode("王五", 15);
        instructor.handleRequest(leaveNode3);
        
        //请假20天的请假条
        LeaveNode leaveNode4 = new LeaveNode("赵六", 20);
        instructor.handleRequest(leaveNode4);
	}
}
