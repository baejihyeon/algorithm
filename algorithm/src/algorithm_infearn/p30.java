package algorithm_infearn;

import java.util.*;

/*안전 영역*/ 
public class p30 {
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int N;
	static int level;
	static int[][] map;
	static int[][] visited;
	static int max = 0;
	static int maxcount = 0;
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
		N = sc.nextInt();

		map = new int[N][N];
		int[][] visited = new int[N][N];

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = sc.nextInt();
				if (max < map[i][j]) {
					max = map[i][j];
				}
			}
		}

		for (int j = 0; j <= max; j++) {
			visited = new int[N][N];
			int count = 0;
			for (int i = 0; i < map.length; i++) {
				for (int z = 0; z < map[i].length; z++) {
					if (map[i][z] <= j) {
						visited[i][z] = 0;
					} else if (map[i][z] > j) { // 1 안전영역
						visited[i][z] = 1;
					}
				}
			}

			for (int i = 0; i < visited.length; i++) {
				for (int z = 0; z < visited[i].length; z++) {
					if (visited[i][z] == 1) {
						Q.add(new Pair(i,z));
						bfs(i, z, visited);
						
						count++;
					}
				}
			}

			if (maxcount < count) {
				maxcount = count;
			}
		}

		System.out.println(maxcount);
	}

	public static void bfs(int x, int y, int[][] visited) {
		while (!Q.isEmpty()) {
			Pair now = Q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if (nx > -1 && ny > -1 && nx < N && ny < N && visited[nx][ny] == 1) {
					visited[nx][ny] = 0;
					Q.add(new Pair(nx, ny));
				}
			}
		}
	}
}
