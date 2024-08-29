import java.util.*;
public class TestHashSetRemove{
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
cars.remove("Toyota");
  System.out.println("Running the .remove(Toyota) method on the cars HashSet returns"+ cars);

        
        //System.out.println(names);
	}

}