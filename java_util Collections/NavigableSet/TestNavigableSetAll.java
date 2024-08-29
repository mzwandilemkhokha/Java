//Iterator<Integer> it = set.iterator();
import java.util.*;
public class TestNavigableSetAll{
	public static void main(String args[] ){

  NavigableSet<Long> longNum= new TreeSet<Long>();
  longNum.add(5l);
  longNum.add(60l);
  longNum.add(4l);
  longNum.add(52l);
  longNum.add(4l);
  longNum.add(7l);
  longNum.add(41l);
  longNum.add(3l);
   System.out.println(longNum);
   System.out.println("The first() method returns:"+ longNum.first());
   System.out.println("The last() method returns:"+longNum.last());
   System.out.println("The floor(10) which return the previous element returns: "+longNum.floor(10l));

   System.out.println("The ceiling(10) which return the previous element returns: "+longNum.ceiling(10l));

}
}