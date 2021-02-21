import java.util.*;
import java.io.*;
class ArrayRotation{
	
	public static void main(String [] args) throws IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int noCase = Integer.parseInt(br.readLine());
		
	
		while(noCase-->0){
			
		String a[] = br.readLine().trim().split(" ");
		int n=0,k=0;
		
		n = Integer.parseInt(a[0]);
		
		k = Integer.parseInt(a[1]);
		
		String arr[] = br.readLine().trim().split(" ");
		
		String out[] = rotateRight(k,n,arr);
		
		for(String s:out){
			System.out.print(s+" ");
		}
			
		}
		

		pw.close();
		
			
	}
	static String [] rotateRight(int k,int n,String arr[]){
		String temp[] = new String[k];
		String newArr[] = new String[n];
		int c=k-1;
		for(int i=n-1;i>=n-k;i--){
			temp[c--] = arr[i];
		}
		int next=k;
		for(int j=0;j<arr.length;j++){
		
			if(j<k){
				newArr[j]=temp[j];
			}
			else{
				newArr[j] = arr[j-next];
			}
		}
		
		return newArr;
	}
}