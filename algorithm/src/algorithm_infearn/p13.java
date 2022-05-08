package algorithm_infearn;

import java.util.*;

public class p13 {
	static boolean[] visited;
	static int[][] graph ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //정점 숫자 
		int M = sc.nextInt(); //간선
		int V = sc.nextInt();
		graph= new int[N + 1][N + 1];
		
		
		for (int i = 0; i < M; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			graph[a][b] = graph[b][a] = 1;
		}
		
		visited = new boolean[N+1];
		dfs(V);
		
	}

	public static void dfs(int v) {
		
	
		visited[v] = true;
		if(v == graph.length) return;
		
		for(int j=1 ; j<graph.length; j++) {
			if(graph[v][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}
	}

}
