import java.util.*;
class AlienLanguageSorted{
	
	public static void main(String [] args){
		String words[] = new String[]{"a","afb","ghijk"};
		String order = "abcdefghijklmnopqrstuvwxyz";
		
		if(isAlienLanguage(words,order)){
			System.out.println("This is Alien Language!");
		}else{
			System.out.println("This is not Alien Language!");
		}
		
	}
	
	static boolean isAlienLanguage(String words[],String order){
		
		int alphabets[] = new int[26];
		for(int i=0;i<order.length();i++){
			alphabets[order.charAt(i)-'a']= i;
		}
		
		for(int j=0;j<words.length;j++){
			for(int l=j+1;l<words.length;l++){
				int min = Math.min(words[j].length(),words[l].length());
				for(int k=0;k<min;k++){
					char ichar = words[j].charAt(j);
					char jchar = words[l].charAt(l);
					if(alphabets[ichar-'a']<alphabets[jchar-'a']){
						break;
					}else if(alphabets[ichar-'a']>alphabets[jchar-'a']){
						return false;
					}else if(k==min-1 && words[j].length()>words[l].length()){
						return false;
					}
				}
			}
		}
		return true;
	}
	
}