package algorithm_infearn;

import java.util.*;

public class p29 {
	static int N;
	static int M;
	static int[][] cheese;
	static int[][] chk;
	static Queue<Pair> Q = new LinkedList<>();
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	

	static class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		cheese = new int[N][M];
		chk = new int[N][M];

		for (int i = 0; i < cheese.length; i++) {
			for (int j = 0; j < cheese[j].length; j++) {
				cheese[i][j] = sc.nextInt();
				chk[i][j] = 0;
			}
		}

		Q.add(new Pair(0, 0));
		bfs();
		System.out.println(Arrays.deepToString(cheese));
		System.out.println(Arrays.deepToString(chk));
	}

//	ó�� ������ �ǿ��� ġ�� ������ ���Ѵ�.
//	�׵θ��� ���̱� �� ���¿��� ġ�� ���� ���Ѵ�.
//	�׵θ� ġ����� BFS�� �����Ѵ�.
//	�׵θ��� ���̰� �ѽð��� ������Ų��.
//	�� �̻� ���� ġ� ���� ������ �ݺ��Ѵ�.
	
	public static void bfs() {
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Pair now = Q.poll();
				for (int j = 0; j < 4; j++) {
					int nx = now.x + dx[j];
					int ny = now.y + dy[j];
					if (nx > -1 && nx < N && ny > -1 && ny < M) {

							
					}
				}

			}
		}
	}

}
