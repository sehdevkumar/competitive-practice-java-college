import java.util.*;
class BinaryInsertionOperation{
	static Scanner sc = null;
	static Node root;
	public static void main(String [] args){
		sc = new Scanner(System.in);
		
		while(true){
			
			System.out.println("Insert Node");
			int n = sc.nextInt();
		 	if(n==-1){
				break;
			}
			
			insert(n);
		}
		
		display(root);
		
	}
	
	BinaryInsertionOperation(){
	   root = null;
	}
	static void insert(int data){
		root = insertNode(root,data);
	}
	static Node insertNode(Node root,int data){
		if(root==null){
			root = new Node(data);
			return root;
		}
		
		if(root.data>data){
			root.left=insertNode(root.left,data);
		}else if(root.data<data){
			root.right = insertNode(root.right,data);
		}
		return root;
	}
	
	static void display(Node root){
		if(root!=null){
			
			System.out.print(root.data+" ");
			display(root.left);
			display(root.right);
		}
	}
}

// Node Class 

class Node{
	
	Node left,right;
	int data;
	
	public Node(int data){
		this.data = data;
	}

	
}