package algorithm_programmers;

public class lessons_12943 {
	 public void solution() {
		    int num = 6; 
	        for(int i=0 ; i<500 ;i++)
	        {
	            if(num > 1){
	                if(num%2 == 0){
	                	num = num % 2;
	                }else if(num%2 == 1){
	                num = (num * 3) + 1; 
	                }    
	            }
	        }
	        System.out.println(num);
	 }
}