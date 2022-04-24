package algorithm_infearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String input1 = in.nextLine();
	    String[] tmp;
	    
	    String answer ="";
		tmp = input1.split(" ");   
		int max = tmp[0].length();
	    for(int i=0; i<tmp.length; i++) {
	    	if(max < tmp[i].length()) {
	    		answer = tmp[i];
	    	}
	
	    } System.out.println(answer);
	}	
}
//list length 구해서 max 구하기 

