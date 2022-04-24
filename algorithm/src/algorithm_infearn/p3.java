package algorithm_infearn;
import java.util.Scanner;

<<<<<<< HEAD
public class p3 {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String input1 = in.nextLine();
	    String[] tmp;
		tmp = input1.split(" ");
		
		String max = tmp[0];   
		
		for(int i=0; i<tmp.length; i++) {
=======
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
>>>>>>> branch 'main' of https://github.com/baejihyeon/algorithm.git

<<<<<<< HEAD
	    	if(max.length() < tmp[i].length()) {
	    		max = tmp[i];
	    	}
	    } System.out.println(max);
=======
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
>>>>>>> branch 'main' of https://github.com/baejihyeon/algorithm.git
	}	
}
//list length 구해서 max 구하기 
<<<<<<< HEAD
//System.out.println(Arrays.toString(tmp));
//System.out.println(tmp[i].length());
//else if(tmp.length == 1) {
//answer = tmp[0];
//}
=======

>>>>>>> branch 'main' of https://github.com/baejihyeon/algorithm.git
