
import java.util.*;

class BTNode{
	
	BTNode left,right;
	int data;
	
	BTNode(int data){
		this.data = data;
		left=right=null;
		
	}
	
	
	
	
}


class ImplementTree{
	BTNode root = null;
	Queue<BTNode> Q = new LinkedList<BTNode>();
	void insertNode(int data){
		
		if(root==null){
			root = new BTNode(data);
			Q.add(root);
		}
		else{
			
			if(root.data>data){
				while(root.left!=null){
					if(root.left.data>data){
						root.left = new BTNode(data);
						Q.add(root.left);
					}else{
						root.right = new BTNode(data);
						Q.add(root.right);
					}
				}
			}
			if(root.data<data){
				while(root.right!=null){
					if(root.right.data>data){
						root.right = new BTNode(data);
						Q.add(root.right);
					}else{
						root.left = new BTNode(data);
						Q.add(root.left);
					}
				}
			}
			
			
			
		}
		
		
	}
	
	void display(){
		System.out.println(Q.peek().data);
	}
	
	public static void main(String [] args){
		ImplementTree obj = new ImplementTree();
		Scanner sc = new Scanner(System.in);
	    
		
		
		obj.insertNode(10);
		obj.insertNode(13);
		obj.insertNode(17);
		obj.insertNode(21);
		obj.insertNode(89);
		obj.insertNode(13);
		obj.insertNode(9);
		
		obj.display();
		
		
		
		
		
		
		
		
		
	/*	Q.add(new Node(10));
		Q.add(new Node(12));
		Q.add(new Node(13));
		Q.add(new Node(14));
		Q.add(new Node(15));
		Q.add(new Node(18));
		Q.add(new Node(1));
		
	for(Node d:Q){
			System.out.println(d.right);
		}
	*/	
		
		
	}
	
	
	
	
	
	
	
}