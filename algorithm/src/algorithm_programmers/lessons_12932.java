package algorithm_programmers;

import java.util.ArrayList;

//이상한 문자 만들기 
public class lessons_12932 {
	public static void main(String[] args) {
		long n = 12345;
		String s;	
		ArrayList<String> list = new ArrayList<>();
		s = Long.toString(n);
		String[] answer = s.split("");

		for(int i=s.length()-1; i>=0 ;i--) {
			list.add(answer[i]);
		}		
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            result[i] = Integer.parseInt(list.get(i));
        }
	} 
}

//형변환이 까다롭네 이렇게 푸는게 맞나 ?
//System.out.println(Arrays.deepToString(answer)); // String 배열은 이거 써야 나와.
