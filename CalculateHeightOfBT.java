import java.util.*;

class CalculateHeightOfBT{
	static int countLeft=0;
	static int countRight = 0;
	public static void main(String[] args){
		
		
		Node root = null;

		root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(25);
		root.left.right.left = new Node(7);
		root.left.right.right = new Node(9);
        
		int H = TreeHeight(root);
		System.out.print("Height: "+H);
	}
	
	static int TreeHeight(Node root){
		if(root==null) return 0;
	
		return 1+Math.max(TreeHeight(root.left),TreeHeight(root.right));
	}
	
}
class Node{
	
	Node left,right;
	int data;
	
	public Node(int data){
		this.data = data;
	}
	
	
}