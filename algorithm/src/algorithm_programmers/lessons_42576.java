package algorithm_programmers;

import java.util.*;
import java.util.Map.*;
/* 완주하지 못한 선수 (해시) */
public class lessons_42576 {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"}; 
		String[] completion = {"stanko", "ana", "mislav"};
		HashMap<String,Integer> hash = new HashMap<>();
		
		for(int i=0; i <participant.length; i++) {
			if(hash.containsKey(participant[i])){
				hash.put(participant[i], hash.get(participant[i])+1);
			}else {
				hash.put(participant[i], 1);
			}
		}
		
		for(int j=0; j<completion.length; j++) {
			hash.put(completion[j], hash.get(completion[j])-1); //(key, value라는 쌍이라는걸 잊지말기.)
		
		}
		
		
		for(String key: hash.keySet())  { //key를 하나씩 가져오는 것 
			if(hash.get(key) == 1) { //완주를 안햇다.
				System.out.println(key); //.....거의 홀짝 급이엿는데 ;????
			}
		}
		
		
//		Set<Entry<String, Integer>> entrySet = hash.entrySet(); //외우기
//		for(Entry<String, Integer> entry:entrySet) {
//			if(entry.getValue() >=1){
//				System.out.println(entry.getKey());
//			}
//		}


		
	}
}
