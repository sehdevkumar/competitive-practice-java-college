import java.util.*;
class KSum{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array N and K with space sperated");
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println("Enter the Element Into the Array");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int min= Integer.MAX_VALUE;
		int count = n;
		int c = 0;
		int sum = 0;
		for(int i=0;i<n;i++){
			
			if(arr[i]<count){
				 c = 1;
			}
			if(arr[i]>count){
				if(arr[i]%n==0){
					c = n;
				}
				if(arr[i]%n!=0){
					int temp = arr[i]/n;
					c = temp+1;
				}
			}
			if(sum<=k){
				sum = Math.max(sum,sum+c);
				if(sum>k){
					break;
				}
				min = Math.min(min,count);
			}
			sum+=c;
			c = 0;
			count--;
		}
		
		System.out.println("Smallest M Is "+min);
	}
}