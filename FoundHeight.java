import java.lang.*;
public class FoundHeight{
	
	static Node root;
	public static void main(String [] args){
		root = null;
		root = new Node(12);
		root.left = new Node(20);
		root.right = new Node(40);
		root.left.left = new Node(400);
		root.left.right = new Node(500);
		root.right.left = new Node(122);
		root.right.right = new Node(11);
		root.right.right.right  = new Node(18);
		
		
		int height = calHeight(root);
		System.out.println(height);
		
		
	}
	
	static int calHeight(Node root){
		if(root==null){
			return 0;
		}
		return 1 + Math.max(calHeight(root.left),calHeight(root.right));
		
	}
	
}

class Node{
	Node left,right;
	int data;
	public Node(int data){this.data=data;}
}