package algorithm_infearn;
import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String input1 = in.nextLine();
	    String[] tmp;

		tmp = input1.split(" ");
		
		String max = tmp[0];   
		
		for(int i=0; i<tmp.length; i++) {

	    	if(max.length() < tmp[i].length()) {
	    		max = tmp[i];
	    	}
	    } System.out.println(max);
	}	
}



//list length
//System.out.println(Arrays.toString(tmp));
//System.out.println(tmp[i].length());
//else if(tmp.length == 1) {
//answer = tmp[0];
//}
