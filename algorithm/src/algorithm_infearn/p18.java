package algorithm_infearn;


//Integer[] arr = new Integer[2];
//Arrays.sort(arr, Collections.reverseOrder());
/*동전 교환*/
import java.util.*;

public class p18 {

	static int N;
	static ArrayList<Integer> list;
	static int M;
	static int min=Integer.MAX_VALUE;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		M = sc.nextInt();
		Collections.sort(list, Collections.reverseOrder()); // 내림차순
		
		dfs(0,0,list);
		
		System.out.println(min);
	}

	public static void dfs(int sum , int count,ArrayList<Integer> list) {
		
		if(sum > M) return;
		
		if(count > min) return;
		
		if(sum < M ) {
			count ++ ;
		}
		
		if(sum == M) {
			if(min > count) {
				min = count;
			}return;
		}

		for(int j=0; j<list.size(); j++ ) {
			dfs(sum+list.get(j),count, list);
		}
	}
}
