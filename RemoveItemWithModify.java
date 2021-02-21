
class RemoveItemWithModify{
	
		public static void main(String[] args){
			
			int arr[] = {2,2,3,0,4,2,5,6,2};
			int val = 2;
			int start = 0;
			int end = arr.length-1;
			
			while(start<=end){
				
				if(arr[start]==val && arr[end]!=val){
					arr[start]=arr[end];
					arr[end] = val;
					start++;
					end--;
				}
				if(arr[end]==val){
					end--;
				}
				if(arr[start]!=val)
				start++;
				
			}
			
			
			
			for(int i:arr){
				
				System.out.print(i+" ");
			}
			
			System.out.println("length "+(++end));
		}
	
}