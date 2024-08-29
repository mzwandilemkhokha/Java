import java.util.*;
public class TestHashSetContains{
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

   //ashSet<String> carsClone=cars.clone();
  System.out.println("HashSet has the following cars"+ cars);

  System.out.println("The HashSet contains the car brand Bentley is: "+ cars.contains("Bentley"));
  System.out.println("The HashSet contains the car brand Ford is: "+ cars.contains("Ford"));
        
        //System.out.println(names);
	}

}