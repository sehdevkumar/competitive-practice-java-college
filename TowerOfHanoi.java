

class TowerOfHanoi{
	
	public static void main(String args[]){
		
		int ring = 3;
		int rod = 3;
		
		hanoi(3,1,3);
		
		
	}
	
	static void hanoi(int n,int start,int end){
		if(n==1){ System.out.println(start+"-"+end); return;}
		int other  = 2;
		hanoi(n-1,start,other);
		System.out.println(start+"-"+end);
		hanoi(n-1,other,end);	
	}
}