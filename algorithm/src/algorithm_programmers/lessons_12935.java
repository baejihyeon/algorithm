package algorithm_programmers;

import java.util.*;

public class lessons_12935 {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int min = arr[0]; 
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0 ; i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}			
		}System.out.println(min);
		
		for (Integer i : arr) {
			list.add(i);
		}
			System.out.println(list.toString());
			list.remove(Integer.valueOf(min)); //list에서 1의 index를 가져오겠다. list.indexOf(min) //Integer.valueOf(min)
			System.out.println(list.toString()); 

		}
	}


/*    public int[] solution(int[] arr) {
		int[] arr1 = {-1};
		if(arr.length == 1) {
			return arr1;  
		}
		int[] a = new int[arr.length-1];
 		int min = Integer.MAX_VALUE; 
 		for(int i=0; i < arr.length ; i++) {
			if(min > arr[i]){
				min = arr[i];
			}
		}
		for(int i=0, j=0; i < arr.length && j < a.length ; i++ , j++) {
			
			if(arr[i] != min){
				a[j] = arr[i];
			} else {
				j--;
			} 
		}return a;
    }*/


