
import java.lang.*;
import java.text.*;
import java.util.*;

class MyClass {
    public static void main(String args[]) {
      String name = "welcometojava";
      int k =3;
      String current = name.substring(0,k);
      String largest = current;
      String smallest = current;

      for(int i=0;i<=name.length()-k;i++){
          current = name.substring(i,i+k);
          if(current.compareTo(largest)>0){
               largest=current;
          }
          if(current.compareTo(smallest)<0){
               smallest = current;
          }
      }

      System.out.println(smallest);
      System.out.println(largest);


    }
}