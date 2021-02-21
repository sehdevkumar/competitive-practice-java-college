import java.util.*;
import java.lang.*;
class KnapsackProblemWithMemo{
	
	
	static int table[][] = new int[100][100];
	
	public static void main(String [] args){
		
		int weight[] = {1,2,5,6,7};
		int value[]= {1,6,18,22,28};
		int bagCapacity = 11;
		
		for(int i=0;i<6;i++){
			for(int j=0;j<12;j++){
				table[i][j]=-1;
			}
		}
		
		int max_val = knapsack(weight,value,bagCapacity,weight.length);
		
		System.out.print(max_val);
		
		
		for(int i=0;i<6;i++){
			for(int j=0;j<12;j++){
				System.out.print(table[i][j]);
			}
			System.out.println("");
		}
		
	}
	
	
	
	static int knapsack(int weight[],int value[],int W,int n){
		
		if(W==0||n==0){
			return 0;
		}
		if(table[W][n]!=-1){
			return table[W][n];
		}
		
		if(W>=weight[n-1]){
			
			return table[W][n] = Math.max(value[n-1]+knapsack(weight,value,W-weight[n-1],n-1),
			knapsack(weight,value,W,n-1));
			
		}
		else{
			return table[W][n]=knapsack(weight,value,W,n-1);
		}
		
		
	}
	
	
	
}