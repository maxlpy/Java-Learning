package DesignPattern;
interface Command {
	public void execute();
}
class Television {
	public void open() {
		System.out.println("Open TV...");
	}
	public void close() {
		System.out.println("Close TV...");
	}
	public void changeChannel() {
		System.out.println("Change channel...");
	}
}
class Controller {
	private Command openTVCommand;
	private Command closeTVCommand;
	private Command changeChannelCommand;
	
	Controller(Command openTVCommand, Command closeTVCommand, Command changeChannelCommand) {
		this.openTVCommand = openTVCommand;
		this.closeTVCommand = closeTVCommand;
		this.changeChannelCommand = changeChannelCommand;
	}
	public void open() {
		openTVCommand.execute();
	}
	public void close() {
		closeTVCommand.execute();
	}
	public void change() {
		changeChannelCommand.execute();
	}
}
class OpenTVCommand implements Command {
	private Television tv;
	public OpenTVCommand() {
		tv = new Television();
	}
	public void execute() {
		tv.open();
	}
}
class CloseTVCommand implements Command {
	private Television tv;
	public CloseTVCommand() {
		tv = new Television();
	}
	public void execute() {
		tv.close();
	}
}
class ChangeChannelCommand implements Command {
	private Television tv;
	public ChangeChannelCommand() {
		tv = new Television();
	}
	public void execute() {
		tv.changeChannel();
	}
}
public class CommandDemo {
	public static void main(String[] args) {
		Command openCommand, closeCommand, changeCommand;
		
		openCommand = new OpenTVCommand();
		closeCommand = new CloseTVCommand();
		changeCommand = new ChangeChannelCommand();
		
		Controller controller = new Controller(openCommand, closeCommand, changeCommand);
		
		controller.open();
		controller.change();
		controller.close();
	}
}
