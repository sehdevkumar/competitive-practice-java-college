import java.util.*;
class Fibonacci{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int fibbo = calFibo(n,new int[n+1]);
		System.out.println(fibbo);
	}
	
	public static int calFibo(int n,int memo[]){
		
		if(n==0 || n==1){
			return n;
		}
		if(memo[n]!=0){
			return memo[n];
		}
		int f = calFibo(n-1,memo);
		int s = calFibo(n-2,memo);
		// f(8) = f(8-1)+f(8-2);
		int out =f+s;
		memo[n]=out;
		return out;
		
		// 8 = 8+13 = 21 
	}
	  // 1 2 3 4 5 6 7.....
	//1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
	
}

