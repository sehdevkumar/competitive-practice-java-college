import java.util.*;
import java.lang.*;
class SubtreeMatching{
	
	static Node tree1=null,tree2=null;
	public static void main(String [] args){
		
		// Tree1 
		tree1 = new Node(1);
		tree1.left = new Node(2);
		tree1.right = new Node(3);
		tree1.left.left = new Node(4);
		tree1.left.right = new Node(5);
		
		
		// Tree2 
		
		tree2 = new Node(1);
		tree2.left = new Node(2);
		tree2.right = new Node(3);
		tree2.left.left = new Node(4);
		
		
		if(isSameTree(tree1,tree2)){
			System.out.println("Both Of have same Height ");
		}else{
			System.out.println("Both have not same Height !");
		}
		
		if(isSubtree(tree1,tree2)){
			
			System.out.println("Tree2 is Subtree Of Tree1");
			
		}else{
			System.out.println("Tree2 is Not Subtree Of Tree1!");
		}
		
		
		
	}
	
	static boolean isSubtree(Node tree1,Node tree2){
		
		if(tree1==null){
			return false;
		}
		else if(isSame(tree1,tree2)){
			return true;
		}else{
			return isSubtree(tree1.left,tree2) || isSubtree(tree1.right,tree2);
		}
		
	}
	
	static boolean isSame(Node tree1,Node tree2){
		if(tree1==null || tree2 ==null){
			return tree1==null && tree2==null;
		}else if(tree1.data==tree2.data){
			return isSame(tree1.left,tree2.left)&&isSame(tree1.right,tree2.right);
		}else{
			return false;
		}
	}
	
	static boolean isSameTree(Node tree1,Node tree2){
		
		int h1 = calTreeOne(tree1);
		int h2 = calTreeTwo(tree2);
		
	    if(h1==h2){
			return true;
		}
		else{
			return false;
		}
		
	}
	static int count1 = 0;
	static int count2 = 0;
	static int calTreeOne(Node tree1){
		
		if(tree1==null){
			return 0;
		}
		
		return 1+Math.max(calTreeOne(tree1.left),calTreeOne(tree1.right));
		
	}
	static int calTreeTwo(Node tree2){
		
		if(tree2==null){
			return 0;
		}
		
		
		return 1+Math.max(calTreeTwo(tree2.left),calTreeTwo(tree2.right));
		
	}
}

class Node{
	
	int data;
	Node left,right;
	
	public Node(int data){
		this.data = data;
		left = right = null;
	}
	
}