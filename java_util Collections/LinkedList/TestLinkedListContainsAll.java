import java.util.*;
public class TestLinkedListContainsAll{
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
        System.out.println("the first LinkedList has the following names: "+names);
        System.out.println("the second LinkedList has the following names: "+names2);
        System.out.println("containAll method demonstration: ");
        
        System.out.println("running the containsAll() method on the LinkedList returns the following result: "+ names.containsAll(names2));
        
        //System.out.println(names);
	}

}