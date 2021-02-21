class MergeLinkList{
	
	
	static Node root1;
	static Node root2;
	static Node finalroot;
	
	public static void main(String [] args){
		
		// First Linked List
		root1 = new Node(4);
		Node n1 = new Node(5);
		Node n2 = new Node(6);
		
		root1.next = n1;
		n1.next = n2;
		
		// Second Linked List
		
		root2 = new Node(4);
		Node n3 = new Node(5);
		Node n4 = new Node(6);
		
		root2.next = n3;
		n3.next = n4;
		
		display1(root1);
		display1(root2);
		merge(root1,root2);
		System.out.println("Merge List");
		display3(finalroot);
		
	}
	
	MergeLinkList(){
		root1 = null;
		root2 = null;
		finalroot = null;
	}
	
	static void display1(Node root){
		if(root!=null){
			System.out.print(root.val+" ");
			//merge(root.val);
			display1(root.next);
		}
	}
	static void display2(Node root){
		if(root!=null){
			System.out.print(root.val+" ");
			//merge(root.val);
			display2(root.next);
		}
	}
	
	static void  merge(Node root1,Node root2){
		
		finalroot = root1;
		while(root1.next!=null){
			root1 = root1.next;
		}
		root1 = root2;
		
		//finalroot = createList(finalroot,val);
	}
	
	/*static Node createList(Node root,int val){
		if(root==null){
			root = new Node(val);
			return root;
		}
		root.next = createList(root.next,val);
		return root;
	}
	
	static void display3(Node root){
		if(root!=null){
			System.out.print(root.val+" ");
			display3(root.next);
		}
	}*/
}
class Node{
	
	
	Node next;
	int val;
	
	public Node(int val){
		next = null;
		this.val  = val;
	}
	
	
}