class TopView{
	
	static Node root;
	
	public static void main(String [] args){
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		display(root);
		
	}
	
	
	TopView(){
		root = null;
	}
	
	static void display(Node root){
		
		if(root!=null){
			display(root.left);
			System.out.print(root.data+" ");
			display(root.right);
		}
		
	}
	
}
class Node{
	Node left,right;
	int data;
	public Node(int data){
		this.data = data;
		left = right = null;
	}
	
	
}