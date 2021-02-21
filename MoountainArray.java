 import java.util.*;
 import java.lang.*;
 class MoountainArray{
		
		public static void main(String [] args){
			
			int arr[] = {1,2,1};
			int len = arr.length;
			
			int max = 0;
			boolean check1 = false;
			boolean check2 = false;
			for(int i:arr){
				max = Math.max(max,i);
			}
			
			int index = 0;
			for(int i=0;i<arr.length;i++){
				if(max==arr[i]){
					index = i;
				}
			}
			if(index==0 || index==len-1){
				System.out.println("Not Mount Array");
			}
			else{
			int count1 = 0;
			for(int i=0;i<index;i++){
				if(arr[i]<arr[i+1]){
					count1++;
				}
			}
			if(count1==index){
				check1 = true;
				
			}
			int count2 = 0;
			for(int i=index;i<len-1;i++){
				if(arr[i]>arr[i+1]){
					count2++;
				}
			}
			System.out.println(count2+index);
			if(count2+index==len-1){
				check2 = true;
				
			}
			
			
			if(check1&&check2){
				System.out.println("It is Mount Array");
			}
			else{
				System.out.println("It is not Mount Array");
				
			}
			}
			
		}
	 
 }