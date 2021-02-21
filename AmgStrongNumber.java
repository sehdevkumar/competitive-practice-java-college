 
class AmgStrongNumber{
	
	public static void main(String [] argsd){
		int n = 113;
		int k = n;
		int result = 0;
		while(n>0){
			int r = n%10;
			result = result+r*r*r;
			n = n/10;
		}
		
		if(result==k){
			System.out.println("This number was amgstrong "+result);
		}else{
			System.out.println("Not a amgstrong ");
		}
	}
	
	
}