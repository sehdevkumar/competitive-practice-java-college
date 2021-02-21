import java.util.*;
class TreeLogics{
	
	static Node root=null;
	static int count = 0;
	
	public static void main(String [] args){
		
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
	
		display(root);
		LevelByDisplay(root);
		
		
	}
	
	
	
	
	static void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(root.data+" ");
			display(root.right);
		}
	}
	
	
	
	
	static void LevelByDisplay(Node root){
		
		TreeMap<Integer,Integer> mp = new TreeMap<Integer,Integer>();
		Queue<QueueNode> que = new LinkedList<QueueNode>();
		
		que.add(new QueueNode(root,0));
		
		
		
		while(!que.isEmpty()){
			
			QueueNode head = que.poll();
			if(!mp.containsKey(head.level)){
				mp.put(head.level,head.node.data);
			}
			
			if(head.node.left!=null){
				
				que.add(new QueueNode(head.node.left,head.level-1));
				
				
			}
			if(head.node.right!=null){
				
				que.add(new QueueNode(head.node.right,head.level+1));
				
			}
			
			
		}
		System.out.println("Print the Elements");
		for(int k:mp.values()){
			System.out.print(k+" ");
		}
	}
	
}

class QueueNode{
	
	Node node;
	int level;
	
	public QueueNode(Node node,int level){
		this.node = node;
		this.level = level;
	}
	
}

class Node{
	
	Node left,right;
	int data;
	
	public Node(int data){this.data=data;left=right = null;}
	
	
}