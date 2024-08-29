import java.util.*;
public class TestLinkedListSort{
	public static void main(String args[] ){
List<Long> nums = new LinkedList<>();
  
       nums.add(2l);
       nums.add(34l);
       nums.add(12l);
       nums.add(6l);
       nums.add(4l);
       nums.add(54l);
       nums.add(12l);
       nums.add(1l);
       nums.add(14l);
       System.out.println("Linked List before sorting"+ nums);
      Collections.sort(nums);
       System.out.println("LinkedList after sorting"+ nums);
        
        //System.out.println(names);
	}

}