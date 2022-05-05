package algorithm_infearn;

import java.util.*;
/*최대 점수 구하기*/

public class p17 {

	static int N;
	static int M;
	static int[][] array;
	static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		array = new int[N][2];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		dfs(0,0,0,array);
		
		System.out.println(max);
	}

	public static void dfs(int L, int total, int time , int[][] arr) {
		
     if(time > M) return;
     
     if(max < total) {
    	 max = total;
     }
     
     if(L == N) return;
	
		dfs(L+1, total+arr[L][0], time + arr[L][1], arr);
		dfs(L+1,total,time,arr);
	}
}
