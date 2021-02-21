import java.util.*;
class countPathVariableSteps{
	
	public static void main(String[] args){
	 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int steps[] = new int[n];
		System.out.println("Enter the Variable Steps to Jump on Stairs ");
		for(int i=0;i<steps.length;i++){
			steps[i]=sc.nextInt();
		}
		int dp[] = new int[n+1];
		
		dp[n] = 1;
		
		for(int i=n-1;i>=0;i--){
			for(int j=1;j<=steps[i] && i+j<dp.length;j++){
				dp[i]+= dp[i+j];
			}
		}
		
		System.out.println(dp[0]);
		
	 
	}
	
	
}