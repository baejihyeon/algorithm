package algorithm_infearn;


import java.util.Scanner;
/*3. 최대 매출*/
public class p6 {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt(); //n
	    int input2 = in.nextInt(); //k
	    int[] array = new int[input1];
	    int sum = 0;
	    int max = 0;
	    
	    for(int i=0; i<input1; i++) {
	    	array[i] = in.nextInt();
	    }
	    for(int j=0; j < input2; j++) {
	    	sum += array[j];
	    }
	    
	    max = sum;
	    
	    for(int z=0; z< input1-input2 ;z++) {
	    	sum += array[z+input2];
	    	sum -= array[z];
	    	if(max < sum) {
	    		max = sum;
	    	}
	    }
	    System.out.println(max);
	  }
}
