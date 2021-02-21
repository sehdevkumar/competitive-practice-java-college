
import java.util.*;
class MemoizationFibonacci{
	static int Memo[] = new int[51];
	static int calFibonacci(int n){
		if(n==0){
			return Memo[n];
		}
		if(n==1){
			return Memo[n];
		}
		if(Memo[n]!=-1){
			return Memo[n];
		}
		else{
			Memo[n]=calFibonacci(n-1)+calFibonacci(n-2);
			return Memo[n];
		}
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<51;i++){
			Memo[i]=-1;
		}
		Memo[0]=Memo[1]=1;
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int result=calFibonacci(n);
		System.out.println(result);
	}
	
	// 6    1+1+2+4+9
	
}