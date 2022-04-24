package algorithm_programmers;

import java.util.Arrays;
//		
public class lessons_12931 {
public static void main(String[] args) {
	int n = 123;
	String[] answer = null;
	String result = null;
	int a =0;
	result = String.valueOf(n); // "123"
	
	for(int i=0; i<result.length(); i++) {
		answer = result.split("");
	}
	System.out.println(Arrays.toString(answer));
	for(int i=0; i<answer.length; i++) {
		a += Integer.parseInt(answer[i]);  //외우기
	}
	System.out.println(a);
}
}
