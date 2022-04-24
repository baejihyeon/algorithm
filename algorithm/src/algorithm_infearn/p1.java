package algorithm_infearn;
import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	   String input1 = in.nextLine();
	   String input2 = in.nextLine();
	   ArrayList<String> list = new ArrayList<>();
	   int num  =0;
	   for(int i=0; i<input1.length(); i++) {
		 
		   list.add(input1.substring(i, i+1)); 
	   }
	   
	   for(String str : list) {
		   if((input2.toLowerCase()).equals(str)) {
			  num = num+1; 
		   }
		   else if((input2.toUpperCase()).equals(str)) {
			   num = num +1;
		   }
	   }
	    System.out.println(num);
	}
}
