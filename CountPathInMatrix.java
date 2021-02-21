 
class CountPathInMatrix{
	
	public static void main(String[] args){
		
		int n = 3;
		int m = 3;
		
		int count = calPath(n,m);
		
		System.out.println("Possible Path "+count);
	}
	
	public static int calPath(int n,int m){
		
		if(n==1&&m==1){
			return 1;
		}
		if(n==0||m==0){
			return 0;
		}
		
		return calPath(n-1,m)+calPath(n,m-1);
		
		
	}
	
}