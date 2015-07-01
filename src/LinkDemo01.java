

class Link {
	
	class Node {
		private String name;
		private Node next;
		
		public Node(String string) {
			this.setName(string);
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Node getNext() {
			return this.next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public void addNode(Node node) {
			if (next == null) 
				this.next = node;
			else 
				this.next.addNode(node);
		}
		public boolean searchNode(String name){
			if(this.name.equals(name))
				return true;
			else {
				if(this.next != null)
					return this.next.searchNode(name);
				else
					return false;
			}
		}
		public void deleteNode(Node preNode, String name) {
			if (this.name.equals(name)) 
				preNode.next = this.next;
			else 
				this.next.deleteNode(this, name);
		}
		public void printNode() {
			System.out.print(this.name + "-->");
			if(this.next != null)
				this.next.printNode();
		}
	}
	
	private Node root;
	public boolean search(String name){
		if(this.root != null)
			return this.root.searchNode(name);
		else
			return false;
	}
	public void add(String name) {
		Node newNode = new Node(name);
		if(this.root == null)
			this.root = newNode;
		else 
			this.root.addNode(newNode);
	}
	public void delete(String name) {
		if (this.search(name)) {
			if (this.root.name.equals(name)) {
				if (this.root.next != null)
					this.root = this.root.next;
				else
					this.root = null;
			}
			else {
				if (this.root.next != null)
					this.root.deleteNode(root, name);
			}
		}
	}
	public void print() {
		if(this.root != null)
			this.root.printNode();
	}
}
public class LinkDemo01 {
	public static void main(String[] args) {
//		Node root = new Node("Root");
//		Node n1 = new Node("Node1");
//		Node n2 = new Node("Node2");
//		Node n3 = new Node("Node3");
//		
//		root.setNext(n1);
//		n1.setNext(n2);
//		n2.setNext(n3);
//		n3.setNext(null);
//		print(root);
//	}
//	public static void print(Node node) {
//		if(node != null) {
//			System.out.println(node.getName()+ "-->");
//			print(node.getNext());
//		}
//		else 
//			System.exit(0);
		
		Link link = new Link();
		link.add("Root");
		link.add("Node1");
		link.add("node2");
		link.delete("Root");
		link.print();
		
	}
}
