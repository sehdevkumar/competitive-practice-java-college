// Queue implemention  though array in java 
class QueueArray{
  
  static int front,rear=-1;
  static int [] Queue = new int[9];
  static int size = Queue.length;
  
  static void enQueue(int data){
	  
	  if(rear==size-1){
		  System.out.println("Queue is full");
	  }else{
		  rear++;
		  Queue[rear] = data;
		  if(front==-1){
			  front=0;
		  }
	  }
	  
  }
  
  static void display(int Q[]){
	  if(front==-1){
		  System.out.println("Queue is Empty");
	  }else{
		  
		  for(int i=front;i<rear+1;i++){
			  System.out.print(Queue[i]+" ");
		  }
		  
	  }
  }
 
  
  public static void main(String[] args){
	  
	  
	  enQueue(12);
	  enQueue(13);
	  enQueue(15);
	  enQueue(16);
	  enQueue(17);
	  enQueue(18);
	  enQueue(19);
	  enQueue(20);
	  enQueue(21);
	  enQueue(21);
	  
	  display(Queue);
	  
  }
  
  
  
}


