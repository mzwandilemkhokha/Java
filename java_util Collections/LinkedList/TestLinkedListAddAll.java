import java.util.*;
public class TestLinkedListAddAll{
	public static void main(String args[] ){
 LinkedList<String> names = new LinkedList<>();
  LinkedList<String> names2 = new LinkedList<>();
        names.push("Thabo");
        names.push("Itu");
        names.push("Mzwandile");
        //adding names to the second arraylist
         names2.push("Tumi");
        names2.push("Nkosazana");
        names2.push("Mzwandile");
        System.out.println("the first LinkedList has th following names: "+names);
        System.out.println("the second LinkedList has th following names: "+names2);
        System.out.println("addAll method demonstration: ");
        names.addAll(names2);
        System.out.println("Adding both arrays using the method addAll return the following result: "+ names );
        
        //System.out.println(names);
	}

}