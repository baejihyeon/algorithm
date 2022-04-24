package algorithm_infearn;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    String answer = null;
	    String result=null;
	    String list ="";
	    char tmp;
	    for(int i=0; i<input1.length(); i++) {
	    	if(input1.charAt(i) > 90) {
	    		tmp = input1.charAt(i);
	    		result = String.valueOf(tmp);
	    		answer = result.toUpperCase();
	    		list += answer;

	    	}else if(input1.charAt(i) < 90) {
	    		tmp = input1.charAt(i);
	    		result = String.valueOf(tmp);
	    		answer = result.toLowerCase();
	    		list += answer;
	    	}
	    }
		System.out.println(list);
	}
}



