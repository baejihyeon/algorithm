package algorithm_infearn;

/* ¹Ì·ÎÅ½»ö */
import java.util.*;

public class p20 {

	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static int answer = 0;
	static int[][] map = new int[7][7];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		dfs(0, 0);
		System.out.println(answer);
	}

	public static void dfs(int x, int y) {
		if(x == 6 && y == 6) {
			answer++;
			return;
		}
		for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
			if (nx > -1 && nx < 7 && ny < 7 && ny > -1 && 
					map[nx][ny] == 0) {
				map[x][y] = 1;
				dfs(nx, ny);
				map[x][y] = 0;
			}
		}
	}
}

//for(int i =0; i<map.length; i++) {
//for(int j =0 ; j<map[i].length; j++) {
//		System.out.print(map[i][j] + " ");
//}
//System.out.println();
//}	
