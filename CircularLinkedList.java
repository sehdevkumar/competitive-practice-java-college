import java.util.*;							
class CircularLinkedList{
	static Node temp=null;
	      static int front ,rear;
		  static Node head;
		  CircularLinkedList(){
			 front=rear=-1;
			 head=null;
		  }
		 
		static Node start = head;
		Node enqueue(int data){
				if(head==null){
					head=new Node(data);
					temp=head;
					return head;
				}
				temp.next=new Node(data);
			
				temp=temp.next;
				return head;
			}
		
		
		  void display(Node head){
			  if(start!=head){
				  System.out.print(head.data+" ");
				  display(head.next);
			  }
		  }
		public static void main(String [] args){
			CircularLinkedList ql=new CircularLinkedList();
			Node t,f;
		     t=ql.enqueue(12);
			 ql.enqueue(33);
			 ql.enqueue(12);
			 ql.enqueue(34);
			 f=ql.enqueue(67);
				if(f.next==null){
					f.next = t;
				}
			 ql.display(f);
			
		}
	
	
	
}

class Node{
	
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}