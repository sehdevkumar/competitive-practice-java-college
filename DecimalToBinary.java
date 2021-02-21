class DecimalToBinary{
	
		public static void main(String []args){
			
			int num = 15;
			String s = "";
			
			while(num!=0){
				int r = num%2;
				num = num/2;
				s = r+""+s;
			}
			
			
			System.out.print(s);
			
		}
	
}
//Time:O(log(n)).
//Space:O(1). 