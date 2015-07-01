package interview.google;

public class Numberof1Bits {
	public int hamingWeight(int n) {
		int sum = 0;
		int count = 0;
		int k = 0;
		while (k < n) {
			if (Math.pow(2, k) <= n) {
				k++;
			} else {
				break;
			}
		}
		for (int i = k; i >= 0; i--) {
			int temp = (int) Math.pow(2, i);
			if (sum + temp <= n ) {
				sum += temp;
				count++;
			} 
		}
		return count;
	}
	
	public int hamingWeight2(long n) {
		if (n > Integer.MAX_VALUE) {
			return 1;
		}
		int count = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n >>= 1;
		}
		return count;
	}
	public static void main(String[] args) {
		int n = 21474;
		Numberof1Bits test = new Numberof1Bits();
		System.out.println(test.hamingWeight2(n));
	}
}
