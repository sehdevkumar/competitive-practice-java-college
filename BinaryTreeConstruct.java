import java.util.*;

class BinaryTreeConstruct{
	static Node1 root1;
	static Scanner sc  = null;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		System.out.println("Insert Node1");
		while(true){
			int n = sc.nextInt();
			if(n==-1){
				break;
			}
			insert(n);
			
		}
		
		display(root1);
		System.out.println("");
		int height = calHeight(root1);
		System.out.println("Height Of Tree : "+height);
		
		
		
	}
	static int calHeight(Node1 root){
		if(root==null){
			return 0;
		}
		return 1 + Math.max(calHeight(root.left),calHeight(root.right));
		
	}
	
	BinaryTreeConstruct(){
		root1 = null;
	}
	
	static void display(Node1 root1){
		if(root1!=null){
			display(root1.left);
			System.out.print(root1.data+" ");
			display(root1.right);
		}
	}
	static void insert(int data){
		root1 = CreateTree(root1,data);
	}
	
	static Node1 CreateTree(Node1 root1,int data){
		if(root1==null){
			root1 = new Node1(data);
			return root1;
		}
		else if(data<root1.data){
			root1.left = CreateTree(root1.left,data);
		}else if(data>root1.data){
			root1.right = CreateTree(root1.right,data);
		}
		
		
		return root1;
	}
	
	
}


//Node1 class
class Node1{
	Node1 left,right;
	int data;
	public Node1(int data){
		this.data = data;
		left=right=null;
	}
}