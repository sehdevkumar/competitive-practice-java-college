import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		int m1[][] = new int[r1][c1];
		
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		int m2[][] = new int[r2][c2];
		
		if(c1!=r2){
		    System.out.println("Invalid Input");
		    return;
		}
		
		for (int i=0;i<m1.length;i++){
		    
		    for (int j=0;j<m1[0].length;j++ ) {
		        m1[i][j] = sc.nextInt();
		    }
		    
		} 
		
		for (int i=0;i<m2.length;i++){
		    
		    for (int j=0;j<m2[0].length;j++ ) {
		        m2[i][j] = sc.nextInt();
		    }
		    
		} 
		
		int m3[][] = new int[r1][c2];
		
		
		for (int i=0;i<m3.length;i++){
		    
		    for (int j=0;j<m3[0].length;j++ ) {
		        for (int k=0;k<c1;k++ ){
		            
		            m3[i][j]+= m1[i][k]*m2[k][j];
		            
		        } 
		    }
		    
		} 
		
		for (int i=0;i<m3.length;i++){
		    
		    for (int j=0;j<m3[0].length;j++ ) {
		        System.out.print(m3[i][j]+" ");
		    }
		    System.out.println("");
		} 
		
		/*if(N%2==0){
            return 2;
        }
        double s = Math.sqrt(N);
        for(int i=2;i<=(int)s;i++){
            if(N%i==0){
                return i;
            }
        }

        return N;
*/
	}
}
