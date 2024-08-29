//Iterator<Integer> it = set.iterator();
import java.util.*;
public class TestHashSetIterator{
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

Iterator<String> carsIterator = cars.iterator();
   while(carsIterator.hasNext()){

        System.out.println(carsIterator.next());
   }
	}

}
