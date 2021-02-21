
class MergeList{
	
	
	static Node list1,list2,list3;
	public static void main(String [] args){
		
		list1 = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		
		
		list1.next = n1;
		n1.next = n2;
		
		list2 = new Node(4);
		Node n3 = new Node(5);
		Node n4 = new Node(6);
		//Node n5 = new Node(3);
		
		list2.next = n3;
		n3.next = n4;
		//n4.next = n5;
		
		boolean response = checkLength(list1,list2);
		if(response){
			
		Node head=mergeList(list1,list2);
		display(head);
			
		}else{
			System.out.println("Not Equal!");
		}
		
	}
	
	MergeList(){
		list1 = null;
		list2 = null;
		list3 = null;
	}
	static void display(Node head){
		if(head!=null){
			System.out.print(head.data+" ");
			display(head.next);
		}
	}
	static boolean checkLength(Node list1,Node list2){
		int count1=0,count2 = 0;
		if(list1==null && list2==null){
			return true;
		}
		while(list1.next!=null){
			count1++;
			list1 = list1.next;
		}while(list2.next!=null){
			count2++;
			list2 = list2.next;
		}
		if(count1==count2){
			return true;
		}
		return false;
	}
	static Node mergeList(Node head1,Node head2){
		
		Node temp = head1;
		while(temp.next!=null){
			temp = temp.next;
		}
		
		while(head2.next!=null){
			temp.next = head2;
			temp = temp.next;
			head2 = head2.next;
		}
		
		return head1;
		
	}
}
class Node {
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		next = null;
	}
}