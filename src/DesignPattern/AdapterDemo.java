package DesignPattern;
interface Window {
	void open();
	void close();
	void icon();
	void unicon();
}
abstract class WindowAdapter implements Window {
	public void open() {}
	public void close() {}
	public void icon() {}
	public void unicon() {}
}
class MyWindow extends WindowAdapter {
	public void open() {
		System.out.println("Open Window.");
	}
}
public class AdapterDemo {
	public static void main(String[] args) {
		MyWindow myWindow = new MyWindow();
	}
}
