package algorithm_infearn;

public class p9 {
	public static void main(String[] args) {
		dfs(11);
	}
// ������ ����� pop �ȴ�.
	public static void dfs(int n) {
		if (n == 0)
			return;
		else {
			
			
			dfs(n / 2); // n�� 2�� ���� ������
			System.out.print(n % 2);
		}
	}

}
