package algorithm_infearn;

public class p8 {
	public static void main(String[] args) { /* ����Լ��� �������� �ڱⰡ �ڱ� �ڽ��� ȣ���ϴ� �Լ��̴� */

		dfs(3);
	}

	public static void dfs(int n) {
		if (n == 0)
			return; // ���� void ������ �Լ� ������ �ǹ̸� ���Ѵ�.
		else {
			dfs(n - 1);
			System.out.print(n + " "); // ���� frame
		}
	}
}
