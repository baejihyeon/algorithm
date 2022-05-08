package algorithm_programmers;

public class lessons_43162 {
	/* level3_네트워크 */
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };

		boolean[] visited = new boolean[n];
		
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			if(visited[i] == false) {
				dfs(i,visited,computers);
				cnt++;
			}
		}
	}

	public static void dfs(int v, boolean[] visited, int[][] computers) {

		visited[v] = true;
		if(v == computers.length) return;
		
		for (int i = 0; i < computers.length; i++) {
			if (computers[v][i] == 1 && visited[i] == false) {
				dfs(i, visited, computers);
			}
		}
	}
}
