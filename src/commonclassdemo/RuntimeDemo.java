package commonclassdemo;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime run = Runtime.getRuntime();
		System.out.println(run.maxMemory());
		System.out.println(run.freeMemory());
		System.out.println(run.totalMemory());
		String str = null;
		for (int i = 0; i < 1000; i++) 
			str += 2*i;
		
		System.out.println(run.maxMemory());
		System.out.println(run.freeMemory());
		System.out.println(run.totalMemory());
//		run.exec("eclipse");   // run a program
//		run.gc();
		System.gc();
		System.out.println(run.maxMemory());
		System.out.println(run.freeMemory());
		System.out.println(run.totalMemory());
		
	}
}
