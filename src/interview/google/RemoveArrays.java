package interview.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Remove second array's elements from the first array
public class RemoveArrays {

	public int[] removeDupElements(int[] src, int[] des) {
		
		List<Integer> list = new ArrayList<Integer>();
		if (des == null || src == null) {
			return src;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < src.length; i++) {
			if (map.containsKey(src[i])) {
				map.put(src[i], map.get(src[i])+1);
			} else {
				map.put(src[i], 1);
			}
		}
	
		for (int j = 0; j < des.length; j++) {
			if (map.containsKey(des[j])) {
				if (map.get(des[j]) != null) {
					if (map.get(des[j]) > 1) {
						map.put(des[j], map.get(des[j]) - 1);
					} else {
						map.remove(des[j]);
					}
				}
			}
		}
		
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		for (Map.Entry<Integer, Integer> elm: set) {
			int key = elm.getKey(); 
			int value = elm.getValue();
			for (int i = 0; i < value; i++) {
				list.add(key);
			}
		}
		int[] res = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			res[i] = list.get(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] src = {1,2,3,4,5,6,6,7,7,8};
		int[] des = {1,5,6,6,8};
		RemoveArrays test = new RemoveArrays();
		int[] res = test.removeDupElements(src, des);
		System.out.println(Arrays.toString(res));
	}

}
