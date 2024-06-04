import java.util.*;

public class ArrayListTest5 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("apple");
           list.add("pear");
            System.out.println(list);
            list.remove(1);
            System.out.println("1 item removed"+list);
          

         System.out.println("list size"+list.size());
    }
}
