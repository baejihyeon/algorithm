package algorithm_infearn;

public class p10 {
public static void main(String[] args) {
	dfs(5);
}

public static int dfs(int n) {
	if(n==1) return 1;
	else {
		return n*dfs(n-1); //5*dfs(4) / 4*dfs(3) 
	}
}
}
