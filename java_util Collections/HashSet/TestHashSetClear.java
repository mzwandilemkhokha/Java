import java.util.*;
public class TestHashSetClear{
	public static void main(String args[] ){
List<Long> nums = new LinkedList<>();
  HashSet<String> cars= new HashSet<String>();
  cars.add("Bentley");
  cars.add("BMW");
  cars.add("Benz");
  cars.add("Toyota");
  cars.add("Hilux");
  cars.add("Lexus");
  cars.add("Volvo");
  cars.add("Mazda");
  System.out.println("HashSet has the following cars"+ cars);
  cars.clear();
  System.out.println("HashSet has the following cars after running clear(): "+ cars);
        
        //System.out.println(names);
	}

}