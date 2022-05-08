package algorithm_infearn;

import java.util.*;
/*미로의 최단거리(BFS)*/

public class p25 {

	static int[][] arr;
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, -1, 0, 1 };
	static int min = 0;
	static Queue<Pair> Q = new LinkedList<>();

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
		arr = new int[7][7];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Q.add(new Pair(0, 0));
		bfs(arr);
		if(arr[6][6] == 0) {
			System.out.println(-1);
		}else {
		System.out.println(arr[6][6]);
		}

	}

	public static void bfs(int[][] arr) {
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				Pair now = Q.poll();
				if (now.x == 6 && now.y == 6)
					return;

				for (int j = 0; j < 4; j++) {
					int nx = now.x + dx[j];
					int ny = now.y + dy[j];
					if (nx > -1 && nx < 7 && ny > -1 && ny < 7 && arr[nx][ny] == 0) {
						arr[nx][ny] = arr[now.x][now.y] + 1;
						Q.add(new Pair(nx, ny));
					}
				}

			}
		}
	}
}
