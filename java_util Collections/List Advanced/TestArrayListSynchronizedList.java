import java.util.*;
public class TestArrayListSynchronizedList{
	public static void main(String args[] ){
ArrayList<String> names = new ArrayList<>();
  
        names.add("Thabo");
        names.add("Itu");
        names.add("Mzwandile");
        //adding names to the second arraylist
         names.add("Simphiwe");
        names.add("Nkosazana");
        names.add("Samkelo");
        System.out.println("The ArrayList has the following names: "+names);
     
             List<String> syncList = Collections .synchronizedList(names); 
             System.out.println("The synchronized List has the following names: "+syncList);  
      
        
        //System.out.println(names);
	}

}