 
 class KadaneAlgo{
	 
	 
	 public static void main(String args[]){
			int arr[] = {1 ,1 ,0 ,0};
			int csum = arr[0];
			int osum = arr[0];
			
			for(int i=1;i<arr.length;i++){
				
				if(csum>=0){
					csum+=arr[i];
					
				}else{
					csum=arr[i];
				}
				if(csum>osum){
					osum=csum;
				}
				
			}
			
			System.out.println(osum);
			
	 }
	 
	 
	 
 }