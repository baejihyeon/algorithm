package algorithm_infearn;

import java.util.*;
/*���ٲ���*/
//x ��ǥ�� 0���� ũ�� 100000���� �۾ƾ���! �����̴ٰ� �۰ų� Ŀ���� �ٷ� ������.
public class p32 {
	static Queue<Integer> Q = new LinkedList<>();
	static int[] visited;
	static int L = 0;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		visited = new int[100001];
		Q.add(N);
		bfs(N, K);
		System.out.println(L);
	}

	public static void bfs(int x, int des) {
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int now = Q.poll();

				if (now == des)
					return;
				if (now >= 0 && now <= 100000){
					if (visited[now] == 0){
						visited[now] = 1;
						Q.add(now + 1);
						Q.add(now - 1);
						Q.add(2 * now);
					}
				}
			}
			L++;
		}
	}

}