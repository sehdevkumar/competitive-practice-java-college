
class MyRemoveAlgo{
	
	public static void main(String []args){
		int arr[] = {0,1,1,1,2,2,4,5,5,6,7,7};
		int len = arr.length-1;
		
		int p1 = 0;
		int p2 = 0;
		int step =0;
		while(p2<len){
			
			if(p1!=p2){
				
				for(int j = p1;j<p1+step;j++){
					arr[j]=-1;
				}
				
				step = 0;
				p1 = p2;
				p2++;
			}
			
			while(p1==p2){
				p2++;
				step++;
			}
			
		}
		
		for(int i:arr){
			System.out.print(i+" ");
			
		}
	}
	
}