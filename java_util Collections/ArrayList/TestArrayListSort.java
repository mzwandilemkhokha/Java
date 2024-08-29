import java.util.*;
public class TestArrayListSort{
	public static void main(String args[] ){
   ArrayList<Long> nums = new ArrayList<Long>();

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

  System.out.println("ArrayList before sorting"+ nums);
  Collections.sort(nums);
  System.out.println("ArrayList after sort"+ nums);
       

        
        //System.out.println(names);
	}

}