// Level Order Traversal 
import java.util.*;
class LevelOrderTraversal{
	
	
	static Node root;
	static int Height = 0;
	public static void main(String [] args){
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);		
		
		long start1 = System.nanoTime();
		Height = calHeight(root);
		
		for(int i=1;i<=Height;i++){
			displayByLevel(root,i);
		}
		System.out.println("");
		long end1 = System.nanoTime();
		System.out.println("Time Take By Without Queue "+(end1-start1)/1000000);
		long start2 = System.nanoTime();
		displayByQueue(root);
		long end2 = System.nanoTime();
		System.out.println("");
		System.out.println("Time Take By Queue "+(end2-start2)/1000000);
		
	}
	
	LevelOrderTraversal(){
		root = null;
	}
	
	static void displayByQueue(Node root){
		Queue<Node> que = new LinkedList<Node>();
		que.add(root);
		while(!que.isEmpty()){
			
			Node head = que.poll();
			System.out.print(head.data+" ");
			
			if(head.left!=null){
				que.add(head.left);
			}
			if(head.right!=null){
				que.add(head.right);
			}
		}
	}
	
	static int calHeight(Node root){
		
		if(root==null){
			return 0;
		}
		return 1+ Math.max(calHeight(root.left),calHeight(root.right));	
	}
	
	
	static void displayByLevel(Node root,int Level){
		
		if(root==null){
			return;
		}
		if(Level==1){
			System.out.print(root.data+" ");
			
		}else if(Level>1){
			displayByLevel(root.left,Level-1);
			displayByLevel(root.right,Level-1);
		}
		
	}
	
}
class Node{
	
	Node left,right;
	int data;
	
	public Node(int data){
		this.data = data;
	}
	
}