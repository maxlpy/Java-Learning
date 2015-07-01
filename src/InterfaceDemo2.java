interface USB {
	void start();
	void stop();
}
class Computer {
	public void plugin(USB usb) {
		usb.start();
		usb.stop();
	}
}
class Printer implements USB {
	public void start() {
		System.out.println("Printer Start");
	}

	@Override
	public void stop() {
		System.out.println("Printer Stop");
	}
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
		Computer computer = new Computer();
		Printer printer = new Printer();
		printer.start();
		computer.plugin(printer);
	}
}
