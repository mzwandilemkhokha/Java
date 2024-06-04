import java.util.*;

public class ArrayListTest9 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();//fruits list
        
        list.add("banana");
        list.add("apple");
           list.add("pear");
        
       ArrayList<String> list2 = new ArrayList<>();//vegetable list
          list2.add("tomatoes");
          list2.add("pumpkin");
          list2.add("cucumber");

    list2.addAll(list);

    System.out.println(list2);

    }
}
