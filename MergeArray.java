class MergeArray{
	
	public static void merger(int[] num1,int m,int num2[], int n){
		int len = num1.length-1;
		if(n==0){
			for(int i:num1){
			System.out.print(i+" ");
			}
			return;
		}
		for(int i = m-1; i>=0; i--){
			num1[len--] = num1[i];
			num1[i] = 0;
		}
		for(int i:num1){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Merge Array");
		
		int c = n;
		int j = 0;
		int k = 0 ;
		while(c<num1.length && j<n){
			
			if(num1[c]<num2[j]){ 
				num1[k++] = num1[c++];
			}else {
				num1[k++] = num2[j++];
			}
		}
		while(c<num1.length){
			num1[k++]=num1[c++];
		}
		
		while(j<n){
			num1[k++]=num2[j++];
		}
		
		for(int i:num1){
			System.out.print(i+" ");
		}
		
		
	}
	
	public static void main(String [] args){
		int num1[] = {1,2,3,0,0,0};
		int num2[] = {2,4,5};
		int m = 3;
		int n = 3;
		
		merger(num1,m,num2,n);
		
	}
	
}