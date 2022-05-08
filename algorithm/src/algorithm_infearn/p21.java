package algorithm_infearn;

import java.util.*;

public class p21 {
	static int N ;
	static int[][] map;
	static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		map = new int[N][N];
		for(int i=0 ; i < map.length; i++) {
			for(int j=0; j <map[i].length; j++) {
				map[i][j] = sc.nextInt();
			}
		}
	  
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 1) {
					System.out.println("dfs : x"+i+",y"+j);
					dfs(i,j,map);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void dfs(int x, int y, int[][] map) {
		System.out.println("x:"+x + ",y" + y);
		
		map[x][y] = 0;
		
		for(int j=0; j <8 ; j++) {
			int nx = x + dx[j];
			int ny = y + dy[j];
			if(nx>-1 && nx < N && ny > -1 && ny < N && map[nx][ny]== 1) {
				
				dfs(nx,ny,map);
			}
		}
	}
	
}


