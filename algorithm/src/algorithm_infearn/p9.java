package algorithm_infearn;

public class p9 {
	public static void main(String[] args) {
		dfs(11);
	}
// 스택의 상단이 pop 된다.
	public static void dfs(int n) {
		if (n == 0)
			return;
		else {
			
			
			dfs(n / 2); // n을 2로 나눈 몫으로
			System.out.print(n % 2);
		}
	}

}
