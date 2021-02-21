import java.util.*;
class Fibonacci2{
	
	
	public static void main(String[] argh){
		
		// Tabulation 
		
		//Memoization
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//.out.println("Fibonacci sum of :"+n+" is "+calFibo(n));
		//int ans = calMemoization(n,new int[n+1]);
		//System.out.println("Fibonacci of "+n+" is "+ans);
		
		
		int memos[] = new int[n+1];
		memos[1]=1;
		memos[2]=2;
		long start=0,end=0;
		for(int i=3;i<=n;i++){
			start = System.nanoTime();
			memos[i]= memos[i-1]+ memos[i-2];
			end = System.nanoTime();
		}
		
		System.out.println(memos[n-1]);
		
		
		
		
		
		
		System.out.println("Taken time By program is "+(end-start)/1000000);
		
		
		
		
		
		
	}
	/*public static int calMemoization(int n, int memo[]){
		if(n<=2){
			return 1;
		}
		if(memo[n]!=0){
			return memo[n];
		}
		int rec = calMemoization(n-1,memo)+calMemoization(n-2,memo);
		memo[n]=rec;
		return rec;
	}
	/*public static int calFibo(int n){
		
		
		if(n<=2){
			return 1;
		}
		
		return calFibo(n-1)+calFibo(n-2);
		
		
	}*/
	
	
}