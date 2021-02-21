import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class SellProduct{
	
	static void display(Stack st){
		for(int i=1;i<st.size();i++){
			System.out.print("'"+i+"."+st.get(i)+"'"+",");
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Stack<String> ItemsList = new Stack<String>();
		Stack<String> soldOut = new Stack<String>();
 		ItemsList.push("");
		ItemsList.push("LION-TOY");
		ItemsList.push("MONKEY-TOY");
		ItemsList.push("BEAR-TOY");
		ItemsList.push("RABIT-TOY");
		ItemsList.push("ELEPHANT-TOY");
		ItemsList.push("GOAT-TOY");
		ItemsList.push("DOG-TOY");
		ItemsList.push("SNAKE-TOY");
		ItemsList.push("CAT-TOY");
		ItemsList.push("DEAR-TOY");
		boolean more = true;
		display(ItemsList);

		while(more){
			
		
		System.out.println("Which Item You want to Buy enter the Name or Position Of the Item Please:-");
		String item = sc.nextLine().toUpperCase();
		
		System.out.println("Okay You have Selected this Item:-"+item);
		// item = 9
		Pattern p = Pattern.compile("^[0-9]+$");
		Matcher m = p.matcher(item);
		
		
		
		if(m.matches()){
			
			//"9"
			//System.out.println(ItemsList.get(Integer.parseInt(item)));
			if(Integer.parseInt(item)==0 || Integer.parseInt(item)>ItemsList.size()-1){
				System.out.println("Invalid Input");
			}else{
			ItemsList.remove(Integer.parseInt(item));
			soldOut.push(ItemsList.get(Integer.parseInt(item)));
			display(ItemsList);
			}
			
		}else{
			// item1
			
			if(ItemsList.search(item)==-1 && soldOut.search(item)!=-1){
				System.out.println("Sold Out Product!");
			}else if(ItemsList.search(item)==-1 && soldOut.search(item)==-1){
				System.out.println("Invalid Input");
			}
			else{
			ItemsList.remove(item);
			soldOut.push(item);
			display(ItemsList);
			}
			
		}

		System.out.println("Do you want to Buy More Products :(y/n)?");
		char check = sc.nextLine().charAt(0);
		if(check=='y'){
			more = true;
		}else if(check=='n'){
			more = false;
			break;
		}else{
			System.out.println("Invalid Chooice");
		}
		
		
		
		
		}
	
		
		
		
	}
	
	
	
	
	
	
	
	
}