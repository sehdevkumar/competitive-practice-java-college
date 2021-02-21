class CheckTwoTreeIsIdentical{
	
	
	
	public static void main(String[] args){
		
		Node root1 = new Node(10);
		
		root1.left = new Node(8);
		root1.right = new Node(15);
		root1.left.left = new Node(4);
		root1.left.right = new Node(9);
		
		
		Node root2 = new Node(10);
		
		root2.left = new Node(8);
		root2.right = new Node(15);
		root2.left.left = new Node(4);
		root2.left.right = new Node(9);
		
		
		if(isIdentical(root1,root2)){
			System.out.println("Both Tree are Identical");
		}else{
			System.out.println("Both Tree are Not Identical");
		}
		
		
		
	}
	
	static boolean isIdentical(Node root1,Node root2){
		
		if(root1==null && root2==null){
			return true;
		}
		
		return (root1.data==root2.data) 
		&& (root1!=null && root2!=null ) 
		&& isIdentical(root1.left,root2.left)
		&& isIdentical(root1.right,root2.right);
		
		
	}
	
	
	
	
}

class Node{
	
	Node left,right;
	int data;
	
	public Node(int data){
		this.data = data;
	}
	
}