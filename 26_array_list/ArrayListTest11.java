import java.util.*;

public class ArrayListTest11 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();//fruits list
       

        list.add("banana");
        list.add("apple");
           list.add("pear");
           list.add("tomatoe");

       String[] list2 = new String[list.size()];//vegetable list
       list.toArray(list2);
       System.out.println("toArray");
         System.out.println("=================");
         System.out.println(list2);
          for(int i=0;i<list.size();i++){
            System.out.println(list2[i]);
           }
        
           

    }
}
