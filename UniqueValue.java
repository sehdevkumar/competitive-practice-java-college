import java.util.*;
class UniqueValue{
	
	public static void main(String [] arg){
		int a[] = {7,7,7,4,1,0,3,2,3};
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			
			if(hm.containsKey(a[i])){
				hm.put(a[i],1);
			}else{
				hm.put(a[i],1);
			}
			
		}
		
		
		for(int i:hm.keySet()){
			
			System.out.print(i+" ");
			
		}
		
	}
	
	
}