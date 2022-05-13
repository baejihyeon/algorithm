package algorithm_infearn;

import java.io.*;
import java.util.*;
/*¾ËÆÄºª*/
public class p34 {
    static int R, C;
    static char[][] board;
    static int[] visited;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};
    static int max;
    static class Pair{
    	int x;
    	int y;
    Pair(int x, int y){
    	this.x = x;
    	this.y = y;
    }
    	
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        R = Integer.parseInt(line[0]);
        C = Integer.parseInt(line[1]);
        board = new char[R][C];
        visited = new int[26];
        for (int i = 0; i < R; i++) {
            board[i] = br.readLine().toCharArray();
        }
       
        
        char alpa = board[0][0];
        int a = alpa - 'A';
        visited[a] = 1;
        int count = 1;
        dfs(0,0,count);
        
        System.out.println(max);

    }
    
    
    public static void dfs(int x, int y, int count) {  	
    	
    	if(max < count) {
    		max = count;
    	}

    	for(int i =0 ; i < 4 ; i++) {  // 4¿µ¿ª Å½»ö
    		int nx = x + dx[i];
    		int ny = y + dy[i];
    		if(nx >-1 && ny > -1 && nx < R && ny < C) {
    			int alpha = board[nx][ny] - 'A';
    			if(visited[alpha] == 0) {
        			visited[alpha] = 1;
    				dfs(nx,ny,count+1);	
    				visited[alpha] = 0;		
    			}
    		}    		
    	}
    }    
}