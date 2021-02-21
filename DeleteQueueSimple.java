class DeleteQueueSimple{
	
	static int front,rear=-1;
	static int Queues[] = new int[10];
	static int size = Queues.length;
	
	static void enQueue(int data){
		if(rear==size-1){
			
			System.out.println("Queue is full");
			
		}else{
			
			rear++;
			Queues[rear]=data;
			if(front==-1){front=0;}
			
		}
	}
	
	static void display(int Queues[]){
		
		if(front==-1){
			System.out.println("Queue is Empty!");
		}else{
			for(int i=front;i<rear+1;i++){
				System.out.print(Queues[i]+" ");
			}
		}
		
		
	}
	static void deQueue(){
		if(front==rear+1 && rear==-1){
			System.out.println("Queue is Empty!");
		}else{
			Queues[front] = 0;
			front++;
		}
	}
	public static void main(String [] args){
		
		
		
		deQueue();
		deQueue();
		deQueue();
		enQueue(22);
		enQueue(23);
		enQueue(24);
		
		display(Queues);
		
		
	}
	
}