 class DuplicateZeros{
	 
	 
	 public static void main(String[] args){
		 
		 int arr[] = {1,0,2,3,0,4,5,0};
		 
		 int len = arr.length;
		 
		 for(int i=0;i<len;i++){
			 
			 if(arr[i]==0){
				 
				 for(int j=i;j<len-1;j++){
					 arr[j]=arr[]; 
				 }
			 }
			 
			 i++;
		 }
		 
		 
		 
		 
	 }
	 
	 
	 
 }