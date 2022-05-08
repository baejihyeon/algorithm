package algorithm_infearn;

import java.util.*;

/*합이 같은 부분의 집합*/
// ArrayList 찍을 때는 list.toString
// 배열일때는 arrays.toString or deepTostring 쓰기

public class p15 {

	static int[] array;
	static boolean[] visited;
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}

		dfs(0);
	}

	public static void dfs(int v) {

		visited[v] = true;

		if (v == array.length)
			return;

		for (int i = 0; i < array.length; i++) {
			int a = array[i];
			if (visited[i] == false && array[i]%a == 0) 
				list.add(array[i]);
				dfs(i);
			}
		}
	
	}



