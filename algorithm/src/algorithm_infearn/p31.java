package algorithm_infearn;

import java.util.*;
/*¿Ø±‚≥Û πË√ﬂ*/
public class p31{
       static int T;
       static int M;
       static int N;
       static int K;    
       static int[] dx = {-1,0,1,0};
       static int[] dy = {0,1,0,-1};
       static int[][] map;
       static class Pair{
           int x;
           int y;
           Pair(int x, int y){
               this.x = x;
               this.y = y;
           }
       }
       static  Queue<Pair> Q = new LinkedList<>();
    
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            map = new int[M][N];
            for(int j=0 ; j<K; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[x][y] = 1;
            }
      
       int count = 0;
        
        for(int x=0; x<map.length ; x++){
            for(int y=0; y<map[x].length; y++){
            if(map[x][y] == 1){
                count++;
                Q.add(new Pair(x,y));
                bfs();
              }  
            }
          }
        System.out.println(count);
        }
        
   }
  
    public static void bfs(){
         while(!Q.isEmpty()){
             Pair now = Q.poll();
             for(int i=0; i< 4; i++){
                 int nx = now.x + dx[i];
                 int ny = now.y + dy[i];
                 if(nx >-1 && ny > -1 && nx <M && ny < N){
                     if(map[nx][ny] == 1){
                         map[nx][ny] = 0;
                         Q.add(new Pair(nx,ny));
                     }
                 }
             }
         }
    }
    
    
}