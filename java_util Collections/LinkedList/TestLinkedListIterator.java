import java.util.*;
public class TestLinkedListIterator{
	public static void main(String args[] ){
 LinkedList<String> names = new LinkedList<>();
  
        names.push("Thabo");
        names.push("Itu");
        names.push("Mzwandile");
        //adding names to the second arraylist
         names.push("Simphiwe");
        names.push("Nkosazana");
        names.push("Samkelo");
        System.out.println("The linkedList has the following names: "+names);
       List<Integer> syncList = Collections.synchronizedList(names);
        System.out.println("Iterator() method demonstration: ");
        Iterator<String> iterator= names.iterator();
        while(iterator.hasNext()){
          System.out.println(iterator.next());
        }
      
        
        //System.out.println(names);
	}

}