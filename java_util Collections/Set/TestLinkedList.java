import java.util.*;
public class TestLinkedList{
	public static void main(String args[] ){
LinkedList<Long> nums = new LinkedList<Long>();

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
  System.out.println("LinkedList before sort"+ nums);
  Collections.sort(nums);
  System.out.println("LinkedList as ArrayList after sort"+ nums);
       

        
        //System.out.println(names);
	}

}