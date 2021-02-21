import java.util.*;
class DeQueue{
	static int front,rear=-1;
	static int [] Queues = new int[5];
	static int size  = Queues.length;
	
	static void enQueue(int data){
		if(rear==size-1){
			System.out.println("Queue is full!");
		}else{
			rear++;
			Queues[rear] = data;
			if(front==-1){
				front=0;
			}
		}
	}
	static void display(){
		if(front==-1){
			System.out.println("Queue is Empty!");
		}else{
			for(int i=front;i<rear+1;i++){
				System.out.print(Queues[i]+" ");
			}
		}
	}
	static void deQueue(){
		
		if(front==-1 && front==rear+1){
			System.out.println("Queue is Empty!");
		}else{
			Queues[front] = 0;
			front++;
		}
		
	}
	public static void main(String [] args){
		
		enQueue(12);
		enQueue(20);
		enQueue(11);
		enQueue(1);
		enQueue(22);
		display();
		System.out.println("");
		deQueue();
		enQueue(42);
		display();
		
		
		
	}
	
	
}