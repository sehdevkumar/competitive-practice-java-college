import java.util.*;
class List_in_List{
	
	public static void main(String [] args){
		
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int a[] = {1,2,3,4,5,6};
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++){
			l2.add(a[i]);
			
			
		}
		list.add(l2);
		System.out.println(list);
		
		
	}
	
	
	
}