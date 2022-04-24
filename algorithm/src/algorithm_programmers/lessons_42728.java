package algorithm_programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//k번째수 
public class lessons_42728 {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<commands.length; i++){
			
			int[] s = new int[commands[i].length];
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int j=0; j<commands[i].length; j++) {
				s[j] = commands[i][j];
			}
			
			for(int z=s[0]-1; z<=s[1]-1; z++) {
				list.add(array[z]);
			}
			
			Collections.sort(list);
			answer.add(list.get(s[2]-1));
		}
		int[] result = new int[answer.size()];
		for(int i=0 ; i<answer.size(); i++) {
			result[i] = answer.get(i);
		}
		System.out.println(Arrays.toString(result));
	}
	
}