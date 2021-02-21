import java.util.*;

class pathCountStairs{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = countStairsPath(n,new int [n+1]);
		
		System.out.println(result);
	
	}
	
	public static int countStairsPath(int n,int[] dp){
		if(n==0){
			return 1;
		}
		else if(n<0){
			return 0;
		}
		if(dp[n]!=0){
			return dp[n];
		}
		int rec1 = countStairsPath(n-1,dp);
		int rec2 = countStairsPath(n-2,dp);
		int rec3 = countStairsPath(n-3,dp);
		int rec = rec1+rec2+rec3;
		dp[n] = rec;
		return rec;
		
		
	}
}