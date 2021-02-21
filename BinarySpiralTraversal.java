import java.util.*;
class BinarySpiralTraversal{
	
	static Node root;
	public static void main(String []args){
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		traversalBySpiralLevelOrder(root);
	
			
	}
	
	BinarySpiralTraversal(){
		root = null;
	}
	
	// Traversal Using Queue in Spiral Fashion
	static void traversalBySpiralLevelOrder(Node root){
		
		Queue<Node> que = new LinkedList<Node>();
		que.add(root);
		
		int spin = 1;
		// check while root empty or not?
		while(!que.isEmpty()){
			Node head = que.poll();
			System.out.print(head.data+" ");
			
			if(spin%2==0){
		
				if(head.left!=null){
					que.add(head.left);
				}
				if(head.right!=null){
					que.add(head.right);
				}
			}
			if(spin%2!=0){
		
				if(head.right!=null){
					que.add(head.right);
				}
				if(head.left!=null){
					que.add(head.left);
				}
			}
			
			spin++;
		}
		
	}
	
	
}
// class Node 

class Node{
	Node left,right;
	int data;
	
	public Node(int data){
			this.data = data;
	}
}