 import java.util.*;
 class TransposeMatrix{
	 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 
		 int arr[][] = new int[n][m];
		 
		 for(int i=0;i<n;i++){
			 
			 for(int j = 0;j<m;j++){
				 arr[i][j] = sc.nextInt();
			 } 
			 
		 }
		 
		 int transpose[][] = new int[m][n];
		 
		  for(int i=0;i<n;i++){
			 
			 for(int j = 0;j<m;j++){
				
				transpose[j][i]= arr[i][j]; 
				// 0 0  = 0 0 
				// 1 0  = 0 1
				
			 } 
			 
			
		 }
		 
		  for(int i=0;i<m;i++){
			 
			 for(int j = 0;j<n;j++){
				
				System.out.print(transpose[i][j]+" ");
				
			 } 
			 
			 System.out.println("");
			 
			
		 }
		 
	 }
	 
	 
 }