package algorithm_infearn;

import java.util.Scanner;
import java.util.*;
import java.util.Map.Entry;
/*학급 회장(해쉬)*/
public class p4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int input1 = in.nextInt();
		String input2 = in.next();
					 
		String[] array = { "A", "B", "C", "D", "E" };
		String[] ban = null;
		String answer ="";
		HashMap<String,Integer> list = new HashMap<>();
		Set<Entry<String,Integer>> entrySet = list.entrySet();

		int max=0; 
		
		for(int i=0; i<input2.length(); i++)
		{
			ban = input2.split("");
			
		}
		for(int i =0; i<array.length; i++) {
			list.put(array[i],0);
		}
		
		for(int i=0; i<ban.length; i++) {
			if(list.containsKey(ban[i])) {
				list.put(ban[i], list.get(ban[i])+1);
			}
		}
		
		for(String key: list.keySet())  { //key를 하나씩 가져오는 것 
			if(list.get(key) >0) {
				 for(int j=0; j < list.size(); j++){
					 if(max < list.get(key))
					 max = list.get(key);
				}
				 for(Entry<String,Integer> entry : entrySet) {
					 if(entry.getValue().equals(max)) {
						 answer = entry.getKey();
					 }
				 }
			}	
		}		
		System.out.println(answer);
	}
}
