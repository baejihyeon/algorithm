package algorithm_programmers;
import java.util.*;

//나누어 떨어지는 숫자배열 
public class lessons_12910 {
	public static void main(String[] args) {
		int[] arr = {3,2,6};
		ArrayList<Integer> list = new ArrayList<>();
		int divisor = 10;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0) {
				list.add(arr[i]);
			}
		}if(list.isEmpty()) {
			//return new int[] {-1};
		}
		Collections.sort(list); //Sorting 하는법.
		int[] result = new int[list.size()];
		for (int i=0; i<list.size(); i++) {
			result[i] = list.get(i); // 외워야한당! 
		}
		System.out.println(result.toString());
	}
}

