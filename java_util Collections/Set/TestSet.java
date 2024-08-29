import java.util.*;
public class TestSet{
	public static void main(String args[] ){

  Set<String> names= new HashSet<String>();
  names.add("michelle");
  names.add("kev");
  names.add("Chalie");
  names.add("Cass");
  names.add("Kabza");
  names.add("Resta");
  names.add("Whale");
  names.add("Power");
  names.add("Master");
  names.add("Mavel");
  names.add("Kinea");
  names.add("Croow");
  names.add("Moaper");
  names.add("Cassp");
  names.add("Foolams");
  names.add("Swaner");
  names.add("Crook");
  names.add("Craw");
  names.add("Somorah");
  names.add("WishiWishi");

 Iterator iter=names.iterator();
System.out.println("The Set has the following elements");
 while(iter.hasNext()){
  System.out.print(iter.next()+" ");
 } 
 
System.out.println();

 
  
  Set<String> sortedSet = new TreeSet<String>(names);
  System.out.println("The Set is sorted as follows: ");
  System.out.println(sortedSet);
  

  System.out.println("The Set synchronized Set is as follows: ");
   System.out.println(Collections.synchronizedSet(sortedSet));

	}

}