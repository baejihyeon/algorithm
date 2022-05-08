package algorithm_infearn;

class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null; // 객체 주소 저장 변수
	}
}

public class p12 {
	
	Node root; //참조형 
	public void dfs(Node root) {
		
	}
	
	public static void main(String[] args) {
		p12 tree = new p12(); // ?
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6); 
		tree.root.rt.rt = new Node(7);
		tree.dfs(tree.root);
		
	}

}
