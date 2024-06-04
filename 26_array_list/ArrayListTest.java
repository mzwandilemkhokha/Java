import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("apple");
           list.add("pear");
            System.out.println(list);
            list.remove(1);
            System.out.println("1 item removed"+list);
            list.clear();

         System.out.println("list Cleared"+list);
    }
}
