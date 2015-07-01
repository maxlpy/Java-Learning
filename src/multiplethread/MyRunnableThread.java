package multiplethread;
// Two methods to create multiple thread(Thread and Runnable), but Runnable is better than Thread.

public class MyRunnableThread implements Runnable {
	private String name;
	public MyRunnableThread(String name) {
		this.name = name;
	}

	@Override
	public void run() { // the main business logic of the thread
		for (int i = 0; i < 10; i++) {
			System.out.println(name +": " + i);
		}
	}
	public static void main(String[] args) {
		MyRunnableThread mt1 = new MyRunnableThread("Thread1");
		new Thread(mt1).start();  // start the thread
		MyRunnableThread mt2 = new MyRunnableThread("Thread2");
		new Thread(mt2).start();
		MyRunnableThread mt3 = new MyRunnableThread("Thread3");
		new Thread(mt3).start();
	}
}
