package algorithm_infearn;

import java.util.*;

/*토마토*/
public class p24 {
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int[][] box;
	static int day = 0;
	static int N;
	static int M;
	static Queue<Pair> Q = new LinkedList<>();
	
	static class Pair {
		int x, y;
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 M = sc.nextInt();
		 N = sc.nextInt();

		box = new int[N][M];
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = sc.nextInt();
				if(box[i][j] == 1) {
					Q.add(new Pair(i,j));
				}
			}
		}
	
		bfs(box);
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) { 
				if(box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}		
		System.out.println(day-1);
	}


	public static void bfs(int[][] box) {
		
		while(!Q.isEmpty()) {
			int len = Q.size(); // 한레벨당 노드의 갯수 
			for(int j=0 ;j<len; j++) {
				Pair now = Q.poll();
					for(int z=0; z<4; z++) {
						int nx = now.x + dx[z]; 
						int ny = now.y + dy[z];
						if(nx>-1 && nx< N && ny > -1 && ny <M && box[nx][ny] == 0
								&&box[nx][ny] != -1)  {
							box[nx][ny] = 1;
							Q.add(new Pair(nx,ny));
						}
					}
			} 
			day++;
		}
		
	}
}
