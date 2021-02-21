import java.util.*;


class menu{
	
	
	
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,Double> hp = new HashMap<Integer,Double>();
		
		hp.put(1,80.0);
		hp.put(2,130.0);
		hp.put(3,100.0);
		hp.put(4,80.0);
		hp.put(5,90.0);
		hp.put(6,110.0);
		hp.put(7,120.0);
		hp.put(8,140.0);
		hp.put(9,70.0);
		hp.put(10,80.0);
		hp.put(11,130.0);
		hp.put(12,160.0);
		hp.put(13,70.0);
		hp.put(14,60.0);
		hp.put(15,40.0);
		hp.put(16,50.0);
		hp.put(17,30.0);
		hp.put(18,40.0);
		hp.put(19,160.0);
		hp.put(20,150.0);
		
		boolean more = true;
		
		double total = 0;
		
		
		while(more){
			
			int oreder = sc.nextInt();
			int qunt = sc.nextInt();
			if(oreder==0 || oreder>20){
				System.out.println("INVALID INPUT");
				more=false;
				break;
			}
			double value = hp.get(oreder);
			total = total+qunt*value;	
			 
			System.out.println("order more items?(y/n)");
			
			char c = sc.next().charAt(0);
			if(c=='y'){
				more = true;
			}if(c=='n'){
				more = false;
				break;	
			}
			
		}
		
		
		System.out.println(total);
		
		
	}
	
	
	
}