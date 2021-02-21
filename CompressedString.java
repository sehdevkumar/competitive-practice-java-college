class  CompressedString{
	
	
	public static void main(String [] args){
		
		char chr[] = {'a','a','b','b','b','c'};
		
		String cur="";
		String next="";
		String prev="";
		int count =0;
		String s="";
		String s2="";
		boolean check=false;
		for(int i=0;i<chr.length;i++){
			
			cur =Character.toString(chr[i]);
			
			if(prev==""){
				prev = cur;
			}
			if(!prev.equals("") && prev.equals(cur)){
				next = cur;
				count++;
				System.out.println(prev+" "+count);
				s2 = next+count+"";
			}
			else{

				prev = cur;
				
				count=1;
				
				
			}
			
			
			
			
		}
		s=s+s2;
		s = s.replaceAll("1","");
		System.out.println(s);
	    
		
		
	}
	
	
	
}