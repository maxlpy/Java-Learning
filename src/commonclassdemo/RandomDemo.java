package commonclassdemo;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println(ran.nextInt(100));
		System.out.println(ran.nextFloat());
		System.out.println(ran.nextGaussian());
	}
}
