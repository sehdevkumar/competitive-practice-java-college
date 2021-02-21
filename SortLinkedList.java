class SortLinkedList{
	
	static Node head;
	public static void main(String [] args){
		
		// Creating Nodes
		head = new Node(12);
		Node n1 = new Node(7);
		Node n2 = new Node(4);
		Node n3 = new Node(15);
		Node n4 = new Node(10);
		
		//Linking nodes
		
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next  = n4;
		
		
		//Print the Linked List Before Sort
		disPlay(head);
		
		Node temp = head;
		while(head.next!=null){
			head = head.next;
			if(temp.data>head.data){
				temp.next = head;
			}
		}
		disPlay(temp);
		
	}
	
	SortLinkedList(){
		head = null;
	}
	static void disPlay(Node head){
		if(head.next!=null){
			System.out.print(head.data+ " ");
			disPlay(head.next);
		}
	}
}

class Node{
	Node next;
	int data;
	public Node(int data){
		this.data = data;
		next = null;
	}
	
}