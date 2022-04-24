package algorithm_programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lessons_86491 {
	public static void main(String[] args) {
		int[][] sizes = {{14,4},{19,6},{6,16},{18,7},{7,11}};
		int temp=0;
		int change =0;
		int answer = 0;
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=0; i<sizes.length;i++) {
			if(sizes[i][0] < sizes[i][1]) {
				
				temp = sizes[i][0];
				change = sizes[i][1];
				
				sizes[i][1]=temp;
				sizes[i][0]=change;
						
			}
			list1.add(sizes[i][0]);
			list2.add(sizes[i][1]);
			Collections.sort(list1);
			Collections.sort(list2);	
		}
		answer = list1.get(list1.size()-1) * list2.get(list2.size()-1);
	}
	
}
