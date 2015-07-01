package interview.nuage.network;

public class GetPeriod {
/**
 * @param data
 * @return
 */
public int getPeriod(int[] data) {
	if (data == null || data.length == 0) {
		return 0;
	}
	
	int  period = 0;
	int len  = data.length - 1;
	int i = 0, j = 1;
	while (i < len && j < len) {
		if(data[i] != data[j]) {		
			j++;
		} else {
			period = j - i;
			int count = 0;
			while (count < period) {
				
				if (data[i+count] == data[j+count]) {
					count++;
				} else {
					period = 0;
					j++;
					break;
				}
			}
			if (count == period && period != 1) {
				return period;
			} else {
				j++;
			}
		}
	}
	return 0;
}
	public static void main(String[] args) {
		int[] data = {1,2,3,4,1,2,3,4};
		int[] data1 = {2,2,3,2,2,3};
		GetPeriod test = new GetPeriod();
		System.out.println(test.getPeriod(data1));
 	}
}

