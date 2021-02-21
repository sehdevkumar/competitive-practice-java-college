class QueueConstruct{
	static int front,rear=-1;
	static int [] MyQueue = new int[10];
	static int size = MyQueue.length;
	
	
	
	static void enqueue(int data){
		
		if(rear==size-1){
			System.out.println("Queue is full ");
		}else{
			rear=rear+1;
			MyQueue[rear] = data;
			if(front==-1){
				front=0;
			}
			
		}
		
		
	}
	static void display(int[] MyQueue){
		
		if(front==-1){
			System.out.println("Queue is Empty! ");
		}else{
			
			for(int i=front;i<=rear;i++){
				System.out.print(MyQueue[i]+" ");
			}
		}
		
		
	}
	public static void main(String [] args){
		
		
		
		
		enqueue(11);
		enqueue(12);
		enqueue(13);
		enqueue(14);
		enqueue(15);
		enqueue(16);
		enqueue(17);
		enqueue(18);
		enqueue(19);
		enqueue(20);
		
		
		display(MyQueue);
		
		
	}
	
	
}