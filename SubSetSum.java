

class SubSetSum{
	static boolean dp[][];
	public static void main(String args[]){
		int set[] = {3, 4, 5, 2};
		int sum = 6;
		dp = new boolean[set.length+1][sum+1];
		
		for(int i=0;i<set.length+1;i++){
			for(int j=0;j<sum+1;j++){
				if(i==0){
					dp[i][j]=false;
				}
				if(j==0){
					dp[i][j]=true;
				}
			}
		}
		
		for(int i=1;i<set.length+1;i++){
			for(int j=1;j<sum+1;j++){
				if(dp[i][j]<=sum){
					
				}
			}
		}
		
		
		
		System.out.println("Print the Array");
		
		for(int i=0;i<set.length+1;i++){
			for(int j=0;j<sum+1;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
		
		
	}
	
	
}