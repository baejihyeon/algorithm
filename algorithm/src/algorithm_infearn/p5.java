package algorithm_infearn;

import java.util.Scanner;
import java.util.*;
/*2. 아나그램(해쉬)*/
public class p5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.next();
		String input2 = in.next();
		String[] list1 = input1.split(""); 
		String[] list2 = input2.split(""); 
		HashMap<String,Integer> hash1 = new HashMap<>();
		HashMap<String,Integer> hash2 = new HashMap<>();
		HashMap<String,Integer> hash3 = new HashMap<>();
		
		for(int i=0; i<list1.length; i++) {
			if(hash1.containsKey(list1[i])) {
				hash1.put(list1[i],hash1.get(list1[i])+1);
			}else hash1.put(list1[i], 1);	
		}
		
		for(int z=0; z<list2.length; z++) {
			if(hash2.containsKey(list2[z])) {
				hash2.put(list2[z],hash2.get(list2[z])+1);
			}else hash2.put(list2[z], 1);
		}
		
		for(String key : hash1.keySet()) {
			for(String key1 : hash2.keySet()) {		
				if(key1.equals(key)) {
					hash3.put(key,hash1.get(key)-hash2.get(key));					
				}
			}
		}
		for(String key : hash3.keySet()) {
			if(hash3.get(key) != 0) {
				System.out.println("NO");
				return; //제어하는것 생각하기.
			}
				
		}
		System.out.println("YES");
	}
}
