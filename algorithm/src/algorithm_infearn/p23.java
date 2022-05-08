package algorithm_infearn;

import java.util.*;

public class p23 {
	static int[] dis = { 1, -1, 5 };
	static int[] chk;
	static int level =0 ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt(); // 현 위치
		int E = sc.nextInt(); // 송아지 위치

		bfs(S, E);
		System.out.println(level);
	}

	public static void bfs(int s, int e) {
		Queue<Integer> que = new LinkedList<>();
		chk = new int[10000];
		chk[s] = 1;
		que.add(s);
		
		while (!que.isEmpty()) {
			int len = que.size();
			for (int j = 0; j < len; j++) {
				int a = que.poll();
				if(a == e) return;
				for (int z = 0; z < 3; z++) {
					int nx = a +dis[z];
					if(nx >=1 && nx <= 10000 && chk[nx] == 0) {
						chk[nx]=1;
						que.add(nx);
					}
				}
			}level++;
		}
	}

}
