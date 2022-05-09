package algorithm_infearn;

import java.util.*;

/*baby shark2 아기상어 2*/
public class p27 {
	static int[][] map;
    static int[] dx = {-1, 1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
	static Queue<Pair> Q = new LinkedList<>();
	static int[][] chk;
	static int N;
	static int M;
	static int max = 0;

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

		map = new int[N][M];
		chk = new int[N][M];
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = sc.nextInt();
				chk[i][j] = Integer.MAX_VALUE;
				if (map[i][j] == 1) {
					Q.add(new Pair(i, j));
					chk[i][j] = 0;
				}
			}
		}
		

		bfs();

	}

	public static void bfs() {

		while (!Q.isEmpty()) {

			Pair now = Q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < N && ny < M){
                	
                    if (chk[nx][ny] > chk[now.x][now.y] + 1) {
                        chk[nx][ny] = chk[now.x][now.y] + 1;
                        Q.add(new Pair(nx, ny));
                        max = Math.max(max, chk[nx][ny]);
                    }
                }
            }
        }
		System.out.println(max);

	}
}
