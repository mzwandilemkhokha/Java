import java.util.*;
public class TestHashSetSize{
	public static void main(String args[] ){

  HashSet<String> cars= new HashSet<String>();
  cars.add("Bentley");
  cars.add("BMW");
  cars.add("Benz");
  cars.add("Toyota");
  cars.add("Hilux");
  cars.add("Lexus");
  cars.add("Volvo");
  cars.add("Mazda");
System.out.println(cars);
   //ashSet<String> carsClone=cars.clone();
  System.out.println("The cars HashSet has the total of "+ cars.size()+" cars");
  
        //System.out.println(names);
	}

}