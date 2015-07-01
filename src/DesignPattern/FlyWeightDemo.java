package DesignPattern;

import java.util.HashMap;
import java.util.Map;

abstract class Shape {
	public abstract void draw();
}
class Circle extends Shape {
	private String color;
	public Circle(String color) {
		this.color = color;
	}
	public void draw() {
		System.out.println("Draw a " + color + " Circle.");
	}
}
class FlyweightFactory {
	static Map<String, Shape> shapes = new HashMap<String, Shape>();
	public static Shape getShape(String key) {
		Shape shape = shapes.get(key);
		
		if(shape == null) {
			shape = new Circle(key);
			shapes.put(key, shape);
		}
		return shape;
	}
	public static int getSum() {
		return shapes.size();
	}
}
public class FlyWeightDemo {
	public static void main(String[] args) {
		Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();
        
        Shape shape2 = FlyweightFactory.getShape("灰色");
        shape2.draw();
        
        Shape shape3 = FlyweightFactory.getShape("绿色");
        shape3.draw();
        
        Shape shape4 = FlyweightFactory.getShape("红色");
        shape4.draw();
        
        Shape shape5 = FlyweightFactory.getShape("灰色");
        shape5.draw();
        
        Shape shape6 = FlyweightFactory.getShape("灰色");
        shape6.draw();
        
        System.out.println("一共绘制了"+FlyweightFactory.getSum()+"中颜色的圆形");
	}
}
