package algorithm_infearn;
/*단지번호*/
import java.util.*;
public class p26 {
	
	static int[][] map;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int N;
	static int[] home;
	static int count =0;
	static int answer =0;
 	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			N = sc.nextInt();
			map = new int[N][N];
		
			 for(int i=0; i<N; i++){
		            String input = sc.next();
		            for(int j=0; j<N; j++){
		                map[i][j] = input.charAt(j)-'0';
		            }
		        }
			
	
			for(int i=0; i< map.length; i++ ) {
				for(int j=0; j<map[i].length; j++) {
					if(map[i][j] == 1) {
					count = 0;
					answer++;
					dfs(i,j,map);
					System.out.println(count);
					}
				}
			}System.out.println(answer);
		
	}
	public static void dfs(int x, int y, int[][] map) {

				for(int i=0; i<4 ;i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if(nx > -1 &&  nx < N && ny > -1 && ny < N && map[nx][ny] == 1) {
						map[nx][ny] = 0;						
						count++;
						dfs(nx,ny,map);
					}
				}
		
	}
}

