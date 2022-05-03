package algorithm_infearn;

import java.util.*;
/*¹ÙµÏÀÌ ½ÂÂ÷ */

public class p16 {
	static int N;
	static int C;
	static int[] W;
	static int max=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt();
		N = sc.nextInt();
		W = new int[N];
		
		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
		}
		dfs(0, 0, W);
		
		System.out.println(max);
	}

	public static void dfs(int l, int sum, int[] w) {
		
		if(sum > C) return;
		
		if(max < sum) {
			max = sum;
		}
		
		if(l==N) return ;
		
		dfs(l+1, sum + w[l], w);
		dfs(l+1, sum, w);		
	}
}