import java.util.*;
public class TestVectorSynchronizedList{
	public static void main(String args[] ){
Vector<String> names = new Vector<>();
  
        names.addElement("Thabo");
        names.addElement("Itu");
        names.addElement("Mzwandile");
        //adding names to the second arraylist
         names.addElement("Simphiwe");
        names.addElement("Nkosazana");
        names.addElement("Samkelo");
names.insertElementAt("Boitumelo",1);

        System.out.println("The vector has the following names: "+names);
     names.removeElementAt(4);
             List<String> syncList = Collections .synchronizedList(names); 
             System.out.println("The synchronized List has the following names: "+syncList);  
      
        
        //System.out.println(names);
	}

}