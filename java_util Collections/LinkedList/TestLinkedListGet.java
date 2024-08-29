import java.util.*;
public class TestLinkedListGet{
	public static void main(String args[] ){
 LinkedList<String> names = new LinkedList<>();
  LinkedList<String> names2 = new LinkedList<>();
        names.push("Thabo");
        names.push("Itu");
        names.push("Mzwandile");
        //adding names to the second arraylist
        System.out.println(names);
        System.out.println("Get method demonstration: ");
        System.out.println("The metod .get(1) returns: "+ names.get(1));
        
        //System.out.println(names);
	}

}