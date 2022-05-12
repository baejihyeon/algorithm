package algorithm_infearn;
/*나이트의 이동*/
import java.io.*;
import java.util.*;
public class p33 {
        static int[] dx = {1,2,2,1,-1,-2,-2,-1};
        static int[] dy = {2,1,-1,-2,-2,-1,1,2};
        static Queue<Pair> Q = new LinkedList<>();
        static class Pair{
            int x;
            int y;
            Pair(int x, int y){
                this.x = x;
                this.y = y;
            }
        }
    
    public int solution(int[][] chessboard,int l, int startx, int starty, int endx, int endy) {
           
           chessboard[startx][starty] = 1;
 
            Q.add(new Pair(startx,starty));
            bfs(chessboard,l);
            return chessboard[endx][endy]-1;
    }
    
    public static void bfs(int[][] chess,int l){
        while(!Q.isEmpty()){
            Pair now = Q.poll();
            for(int i=0; i < 8 ; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if(nx > -1 && ny > -1 && nx < l && ny < l){
                    if(chess[nx][ny] == 0){
                        chess[nx][ny] = chess[now.x][now.y] + 1;
                        Q.add(new Pair(nx,ny));
                    }
                }
            }
        }
        
    }
    
    public static void main(String[] args) throws Exception {
        p33 main = new p33();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int l = Integer.parseInt(br.readLine());
            int[][] chessboard = new int[l][l];
            String[] line = br.readLine().split(" ");
            int fx = Integer.parseInt(line[1]);
            int fy = Integer.parseInt(line[0]);
            
            line = br.readLine().split(" ");
            int ex = Integer.parseInt(line[1]);
            int ey = Integer.parseInt(line[0]);
            bw.append(main.solution(chessboard,l,fx, fy, ex, ey) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
