package DesignPattern;

import java.util.Stack;

interface Node {
	public int interpret();
}
class ValueNode implements Node {
	private int value;
	
	public ValueNode(int value) {
		this.value = value;
	}
	public int interpret() {
		return this.value;
	}
}
abstract class SymbolNode implements Node {
	protected Node left;
	protected Node right;
	
	public SymbolNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}
}
class MulNode extends SymbolNode {
	public MulNode(Node left, Node right) {
		super(left, right);
	}
	public int interpret() {
		return left.interpret() * right.interpret();
	}
}
class ModNode extends SymbolNode {
	public ModNode(Node left, Node right) {
		super(left, right);
	}
	public int interpret() {
		return left.interpret() % right.interpret();
	}
}
class DivNode extends SymbolNode {
	public DivNode(Node left, Node right) {
		super(left, right);
	}
	public int interpret() {
		return left.interpret() / right.interpret();
	}
}
class Calculator {
	private String statement;
	private Node node;
	
	public void build(String statement) {
		Node left = null, right = null;
		Stack stack = new Stack();
		
		String[] statementArr = statement.split(" ");
		
		for(int i = 0; i < statementArr.length; i++) {
			if(statementArr[i].equalsIgnoreCase("*")) {
				left = new ValueNode((int)stack.pop());
				int val = Integer.parseInt(statementArr[++i]);
				right = new ValueNode(val);
				stack.push(new MulNode(left, right));
			}
			else if(statementArr[i].equalsIgnoreCase("/")) {
//				left = (Node) stack.pop();
				left = new ValueNode((int)stack.pop());
				int val = Integer.parseInt(statementArr[++i]);
				right = new ValueNode(val);
				stack.push(new DivNode(left, right));
			}
			else if(statementArr[i].equalsIgnoreCase("%")) {
//				left = (Node) stack.pop();
				left = new ValueNode((int)stack.pop());
				int val = Integer.parseInt(statementArr[++i]);
				right = new ValueNode(val);
				stack.push(new ModNode(left, right));
			}
			else {
				stack.push(Integer.parseInt(statementArr[i]));
			}
		}
		this.node = (Node) stack.pop();
	}
	public int compute() {
		return node.interpret();
	}
}
public class InterpretDemoUF {
	public static void main(String[] args) {
		String str = "3 * 2 * 4 / 6 % 5";
		
		Calculator calculator = new Calculator();
		calculator.build(str);
		System.out.println(calculator.compute());
	}
}
