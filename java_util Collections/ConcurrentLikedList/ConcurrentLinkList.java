import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkList{
	public static void main(String args[] ){
ConcurrentLinkedQueue<String> cars= new ConcurrentLinkedQueue<String>();

cars.offer("Corrolla");
cars.offer("Vivo");
cars.offer("M3");
cars.offer("S40");
cars.offer("Land Cruiser");
cars.offer("Urban Cruiser");
cars.offer("Range Rover");
cars.offer("Bentley");
cars.offer("325i");
cars.offer("320i");
System.out.println(cars.pollFirst);



	}
}