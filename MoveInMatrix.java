import java.util.*;
class MoveInMatrix{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int count = calMove(n,m,new int[n+1][m+1]);
		
		System.out.println("Move to reach destination "+count);
		
	}
	
	public static int calMove(int n,int m,int memo[][]){
		if(memo[n][m]!=0){
			return memo[n][m];
		}
		if(n==1 && m==1){
			return 1;
		}
		if(n==0 || m==0){
			return 0;
		}
		
		memo[n][m]= calMove(n-1,m,memo)+calMove(n,m-1,memo);
		return memo[n][m];
	}
	
	
}