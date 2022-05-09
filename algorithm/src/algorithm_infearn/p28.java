package algorithm_infearn;
import java.util.*;
public class p28 {
	static int[][] arr;
	static int[][] chk;
	static int N;
	static int M;
	static Queue<Pair> Q = new LinkedList<>();
	static int[] dx = {-1,0,1,0,1,1,-1,-1};
	static int[] dy = {0,1,0,-1,1,-1,-1,1};
	static int max = 0;
	static class Pair{
		int x;
		int y;
		Pair(int x, int y){
			this.x = x;
			this.y = y; 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N][M];
		chk = new int[N][M];
		
		
		for(int i=0; i < arr.length; i++){
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				chk[i][j] = Integer.MAX_VALUE;
				if(arr[i][j] == 1) {
					Q.add(new Pair(i,j));
					chk[i][j] = 0;
				}	
			}
		}
		
		bfs();
		System.out.println(Arrays.deepToString(chk));
		
		for(int i=0; i < chk.length; i++){
			for(int j=0; j<chk[i].length; j++) {
				if(max < chk[i][j])
					max = chk[i][j];
			}
		}
		System.out.println(max);
	}
	public static void bfs() {
		while(!Q.isEmpty()) {
			Pair now = Q.poll();
			for(int i=0; i<8 ;i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(nx >-1 && nx < N && ny > -1 && ny < M) {
					if(chk[nx][ny] > chk[now.x][now.y] + 1) {
						chk[nx][ny] = chk[now.x][now.y]+1;
						Q.add(new Pair(nx,ny));
					}
				}
				
				
			}
			
		}
		
	}
}
