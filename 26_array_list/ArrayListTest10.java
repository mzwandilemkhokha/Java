import java.util.*;

public class ArrayListTest10 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();//fruits list
        System.out.println("List of fruits");
         System.out.println("=================");

        list.add("banana");
        list.add("apple");
           list.add("pear");
           list.add("tomatoe");

           for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
           }
        System.out.println("");
        System.out.println("List of vegetable");
        System.out.println("=================");
       ArrayList<String> list2 = new ArrayList<>();//vegetable list
          list2.add("tomatoes");
          list2.add("pumpkin");
          list2.add("cucumber");
             for(int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
           }

    }
}
