package commonclassdemo;

import java.math.BigDecimal;   // BigDecimal and BigInteger are similar.

public class BigNumberDemo {
	public static void main(String[] args) {

		double d1 = Double.MAX_VALUE;
		double d2 = Double.MAX_VALUE;
		System.out.println(d1*d2);
		BigDecimal big1 = new BigDecimal(Double.MAX_VALUE);
		BigDecimal big2 = new BigDecimal(Double.MAX_VALUE);
		System.out.println(big1.multiply(big2));
		System.out.println(big1.add(big2));
		System.out.println(big1.subtract(big2));
		System.out.println(big1.divideAndRemainder(big2));
	}
}
