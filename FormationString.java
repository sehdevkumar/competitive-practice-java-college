class FormationString{
	
	
	public static void main(String[] args){
		
		String source = "acb";
		String target = "abcbc";
		
		
	    //  a+b+cb+c = abcbc 
		
		int lenS = source.length()-1;
		int lenT = target.length();
		int i = 0;
		int j = 0;
		String count = "";
		while(lenT>=0){
			String temp  = target.substring(j);
			while(source.charAt(i)!=temp.charAt(j)&& i<lenS){
				i++;
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
}