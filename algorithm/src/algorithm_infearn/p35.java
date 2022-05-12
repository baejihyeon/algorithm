package algorithm_infearn;

import java.util.*;
/*점프 점프*/
public class p35 {
	static int[] jump;
	static int[] visited;
	static int N;
	static Queue<Integer> Q = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		jump = new int[N];
		visited = new int[N];
		for (int i = 0; i < jump.length; i++) {
			jump[i] = sc.nextInt();
			visited[i] = 0;
		}
		if(N == 1) {  
			System.out.println(0);
			return;
		}
		visited[0] = 0;
		Q.add(0);
		bfs();
		if(visited[N-1] == 0) {
			System.out.println(-1);
		}else {
		System.out.println(visited[N-1]);
		}
	}


	public static void bfs() {
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int now = Q.poll();
				for (int j = 1; j <= jump[now]; j++) {
					int nx = now + j;
					if (nx < N && visited[nx] == 0) {
						visited[nx] = visited[now]+1 ;
						Q.add(nx);
					}
				}
			}
		}
	}
}
