import java.util.*;
public class TestHashSetSort{
	public static void main(String args[] ){
HashSet<Long> nums = new HashSet<>();

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
  System.out.println("HashSet list before sort"+ nums);
  Collections.sort(myNumsList);
  System.out.println("HashSet as ArrayList after sort"+ nums);
       

        
        //System.out.println(names);
	}

}