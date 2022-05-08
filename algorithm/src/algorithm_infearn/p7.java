package algorithm_infearn;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

/*3. 매출액의 종류*/
public class p7 {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    int input2 = in.nextInt();
	    int[] array = new int[input1]; //선언방법 까먹지 말기
	    HashMap<Integer,Integer> list = new HashMap<>();
	    
	    
	    for(int i=0; i<input1; i++) {
	    	array[i] = in.nextInt();
	    }
	    
	    for(int j=0; j<input1-input2; j++) {
	    	if(list.containsKey(array)) {
	    		list.put(array[j],list.get(array[j])-1);
	    	}
	    	System.out.println(list);
	    }
	    
	    
	    System.out.println(Arrays.toString(array));
	    System.out.println(input1 + input2);

	}
}
