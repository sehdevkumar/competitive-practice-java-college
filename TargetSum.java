import java.util.*;
class TargetSum{
	
	public static void main(String[] args){
		
		//Scanner sc = new Scanner(System.in);
		int [] a = {2,4};
		boolean ans = checkTargetSum(8,a);
		System.out.println(ans);

	}
	
	static boolean checkTargetSum(int n,int arr[]){
		
		if(n==0) {return true;}
		if(n<0) { return false;}
		
		for(int i=0;i<arr.length;i++){
			int remainder = n-arr[i];
			if(checkTargetSum(remainder,arr)==true){
				return true;
			}
		}
		
		return false;
		
		
	}
	
}