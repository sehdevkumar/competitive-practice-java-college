import java.util.*;

class javaQueee{
	
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		
		int n = sc.nextInt();
		
		while(n-->0){
			
			int ele = sc.nextInt();
			q.add(ele);
		}
		
		System.out.println("Top"+q.peek());
		System.out.println("Top Element Removed"+q.poll());
		System.out.println("Top"+q.peek());
		
		
		
	}
	
	
	
	
	
	
}