package algorithm_infearn;

public class p11 {
	static int[] fibo;

	/* 피보나치 수열 앞의항 두개 합치는 것 */
	public static void main(String[] args) {

		int n = 10;
		fibo = new int[n + 1];
		dfs(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
	//기록해서 시간 효율 적게하는것 . fibo로 넣어서.
	public static int dfs(int n) {
		if(fibo[n] > 0) return fibo[n];
		
		if (n == 1)
			return fibo[n] = 1;
		else if (n == 2)
			return fibo[n] = 1
			;
		else
			return fibo[n] = dfs(n - 2) + dfs(n - 1);

	}
}
