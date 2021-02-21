

class StringReverseOperation{
	
	public static void main(String[] args){
		
		String str = "a-b-c";
		String match = "[^a-z]";
		String pos = "";
		for(int i =0;i<str.length();i++){
			String s = ""+str.charAt(i);
			if(s.matches(match)){
				pos+=i;
			}
		}
		
		String SimpleStr = str.replaceAll("[^a-z]","");
		System.out.println(SimpleStr);
		
		char arr[] = SimpleStr.toCharArray();
		String r = "";
		
		for(int i=arr.length-1;i>=0;i--){
			r=r+""+arr[i];
		}
		
		System.out.println(r);
		 
		
	}
	
}