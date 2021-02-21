

class ReverseWithoutSymbol{
	
	public static void main(String[] args){
		String s = "Test1ng-Leet=code-Q!";
		String match = "[^a-zA-Z]";
		String simpleS ="";
		int k = 0;
		int i = s.length()-1;
		String last = "";
		boolean check = false;
		while(i>=0){
			String temp1 = Character.toString(s.charAt(i));
			String temp2 = Character.toString(s.charAt(k));
			if(!temp1.matches(match)){
				check = true;
				if(!temp2.matches(match)){
					simpleS+=temp1;
					i--;
					k++;
				}else{
					simpleS+=temp2;
					k++;
				}
			}else{
				if(!check){
					last+=temp1;
				}
				
				i--;
			}
		}
		
		for(int r=last.length()-1;r>=0;r--){
			simpleS+=Character.toString(last.charAt(r));
		}
		System.out.print(simpleS);
		
		
		
		
		
		
		
	}
	
	
}