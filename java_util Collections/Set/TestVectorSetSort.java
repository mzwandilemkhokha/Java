import java.util.*;
public class TestVectorSetSort{
	public static void main(String args[] ){
Vector<Long> nums = new Vector<Long>();

  nums.add(5l);
  nums.add(2l);
  nums.add(23l);
  nums.add(3l);
  nums.add(76l);
  nums.add(43l);
  nums.add(4l);
  nums.add(8l);
  nums.add(12l);
  nums.add(6l);

  ArrayList<Long> myNumsList=new ArrayList<Long>(nums);
  System.out.println("Vector list before sort"+ nums);
  Collections.sort(myNumsList);
  System.out.println("Vector as ArrayList after sort"+ nums);
       

        
        //System.out.println(names);
	}

}