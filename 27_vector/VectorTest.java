import java.util.*;

public class VectorTest {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
           v.add("banana");
           v.add("apple");
           v.add("mango");
           v.add("pears");
            
            Vector<String> v2 = new Vector<>();
              v2.add("tomatoes");
          v2.add("pumpkin");
          v2.add("cucumber");

          v2.addAll(v);
          System.out.println(v2);
        
    }
}


