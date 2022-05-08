package algorithm_infearn;

/*백준 dfs와 bfs*/
import java.util.*;

public class p22 {
	static int[][] arr;
	static boolean[] visited;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();

		arr = new int[N + 1][N + 1];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}

		visited = new boolean[N + 1];
		dfs(V, arr);

		visited = new boolean[N + 1];
		bfs(V);

	}

	public static void dfs(int v, int[][] arr) {
		visited[v] = true;
		System.out.print(v + " ");

		for (int j = 1; j < N + 1; j++)
			if (arr[v][j] == 1 && visited[j] == false) {
				dfs(j, arr); // 현재 다음 갈수 있는 길이 있냐.
			}
	}

	public static void bfs(int v) {
		
		Queue<Integer> que = new LinkedList<>();
		
		visited[v] = true;
		
		que.add(v);
		while (!que.isEmpty()) {
			int now = que.poll();
			System.out.println(now);
			for (int a = 1; a < N + 1; a++) {
				if (arr[now][a] == 1 && visited[a] == false) {
					visited[a] = true;
					que.add(a);
				}
			}
		}

	}
}
//que.offer(null) // return 값이 있음.
