package arrayPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistCollection {

 public static void main(String args){
     ArrayList< String > items = new ArrayList< String >();
     items.add( "red" );
     items.add( 0, "yellow" );
     items.add("taiwo");
     items.add("kenny");
     items.add("mumsy");
     items.add(2, "mumsy");

     display(items, "traversing using enhance loop");
//     using Iterator
     Iterator iterator= items.iterator();
     while(iterator.hasNext()){
         System.out.println(iterator.next());
     }

 }
    public static void display(ArrayList<String> items, String header){
     System.out.printf("%s :", header);
       for(String item : items){
           System.out.println(item);
       }
    }

}
