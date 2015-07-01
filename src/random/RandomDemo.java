package random;

import java.util.Random;

public class RandomDemo {
	public void random() {
		Random randomGenerator = new Random();
		for (int i =0; i < 10; i++) {
			System.out.println(randomGenerator.nextInt(100));
		}
		for (int i =0; i < 10; i++) {
			System.out.println(randomGenerator.nextInt());
		}
	}
	public static void main(String[] args) {
		RandomDemo demo = new RandomDemo();
		demo.random();
	}
}
