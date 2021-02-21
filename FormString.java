
class FormString{
	
	
	public static void main(String[] args){
		
		String source = "abc";
		
		String target = "abcabcc";
		
		int len = target.length();
		int action = 0;
		int j=0;
		int i;
		int count = 0;
		while(len>=1){
			i=0;
			if(j==target.length()-1){
				break;
			}
			while(i<source.length()){
				
				if(source.charAt(i)==target.charAt(j)){
					i++;
					j++;
				}else{
					i++;
					action++;
				}
			
			}
			
			len = target.substring(j).length();
			
			
			
		}
		
		System.out.print(action+1);
	}
	
	
	
}