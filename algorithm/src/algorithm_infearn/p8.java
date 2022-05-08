package algorithm_infearn;

public class p8 {
	public static void main(String[] args) { /* 재귀함수가 무엇인지 자기가 자기 자신을 호출하는 함수이다 */

		dfs(3);
	}

	public static void dfs(int n) {
		if (n == 0)
			return; // 값을 void 형에서 함수 종료라는 의미를 뜻한다.
		else {
			dfs(n - 1);
			System.out.print(n + " "); // 스택 frame
		}
	}
}
