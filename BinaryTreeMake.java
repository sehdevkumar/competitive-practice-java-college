import java.util.*;
class BinaryTreeMake{
	
	static Scanner sc = null;
	
	public static void main(String [] args){
			sc = new Scanner(System.in);
			
			Node root = createNode();
			Node temp = root;
			System.out.println(root.data);
			
	}
	
	
	
	static Node createNode(){
		
		Node root = null;
		
		System.out.println("Please Enter the Data");
		int data = sc.nextInt();
		if(data==-1) return null;
		
		root = new  Node(data);
		System.out.println("Please Enter the Data for left   "+data);
		root.left = createNode();
		
		System.out.println("Please Enter the Data for right  "+data);
		root.right = createNode();
		
		return root;
		
		
		
		
	}
	
	
	
}

class Node{
	
	Node left,right;
	int data;
	
	public Node(int data){
		this.data = data;
	}
	
}