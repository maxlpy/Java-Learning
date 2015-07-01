package DesignPattern;
abstract class Shapes {
	Color color;
	public void setColor(Color color) {
		this.color = color;
	}
	public abstract void draw();
}
class Cricle extends Shapes {
	public void draw() {
		color.bepaint("Circle");
	}
}
class Square extends Shapes {
	public void draw() {
		color.bepaint("Squre");
	}
}
class Rectangle extends Shapes {
	public void draw() {
		color.bepaint("Rectangle");
	}
}
interface Color {
	public abstract void bepaint(String shape);
}
class White implements Color {
	public void bepaint(String shape) {
		System.out.println("White " + shape);
	}
}
class Gray implements Color {
	public void bepaint(String shape) {
		System.out.println("Gray " + shape);
	}
}
class Black implements Color {
	public void bepaint(String shape) {
		System.out.println("Black " + shape);
	}
}
public class BridgeDemo {
	public static void main(String[] args) {
		//白色
        Color white = new White();
        //正方形
        Shapes square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();
        
        //长方形
        Shapes rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();
	}
}
