package algorithm_infearn;

import java.util.*;

/*조합의 경우수 (메모이제이션 사용) */

public class p19 {
	
	static int n;
	static int r;
	static int[][] array;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		
		array = new int[n][r];
		System.out.println(dfs(n,r));
	
	}
	public static int dfs(int n, int r) {
		if(array[n][r] >0) return array[n][r];
		
		if(n==r || r==0) return 1;
		else return array[n][r]= dfs(n-1,r-1) + dfs(n-1,r);
	}
}
