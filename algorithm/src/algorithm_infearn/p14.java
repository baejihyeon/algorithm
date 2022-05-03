package algorithm_infearn;

import java.util.Scanner;

public class p14 {
	static int N;
	static int M;
	static boolean[] visited;
	static int[][] graph;
	static int answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		graph = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			graph[a][b] = graph[b][a] = 1;
		}
		visited = new boolean[N + 1];
		answer = 0;
		int count =0;
		for(int a = 1 ; a <= N ; a++) {
			if(visited[a] == false) {
				System.out.print(a+"부터 시작 :");
				dfs(a);
				
				count++;
			}
		 System.out.println();
		}
		System.out.println(count);
		System.out.println(answer);
	}

	public static void dfs(int v) {

		visited[v] = true;
		
		System.out.print(v + " ");
		for (int i = 1; i < graph.length; i++) {
			if (graph[v][i] == 1 && visited[i] == false) {
				answer++;
				dfs(i);
				
			}
		}

	}
}
