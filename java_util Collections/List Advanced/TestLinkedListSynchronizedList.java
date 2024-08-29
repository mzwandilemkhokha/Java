import java.util.*;
public class TestLinkedListSynchronizedList{
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
     
             List<String> syncList = Collections .synchronizedList(names); 
             System.out.println("The synchronized List has the following names: "+syncList);  
      
        
        //System.out.println(names);
	}

}