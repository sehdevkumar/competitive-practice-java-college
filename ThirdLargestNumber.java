
class ThirdLargestNumber{
	
	public static void main(String[] s){
		
		int nums[] = {3,1,1};
		
		int max1= 0;
		for(int i:nums){
			max1 = Math.max(max1,i);
		}
		// 1 3 2 3 1 3
		int max2 = 0;
		for(int i:nums){
			if(i!=max1){
			   max2 = Math.max(max2,i);
			}
			
		}
		int max3 = 0;
		for(int i:nums){
			if(i!=max1 && i!=max2){
			   max3 = Math.max(max3,i);
			}
			
			
		}
		
		System.out.println(max1+","+max2+","+max3);
		
		if(max1==0 && max2==0 && max3==0){
			System.out.print("There is no element");
		}
		if(max1!=0 && max2!=0 && max3==0){
			System.out.print(Math.max(max1,max2));
		}
		if(max1!=0 && max2==0 && max3==0){

			System.out.print(max1);
		}
		
		if(max1!=0&&max2!=0&&max3!=0){
			
			System.out.print(max3);
		}
		
	}
	
	
}