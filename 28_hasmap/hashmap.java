
import java.util.*;
import java.util.Collection;
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

HashMap<String,String> hashMap = new HashMap<String,String>();
        
        hashMap.put("key1", "A");
        hashMap.put("key2", "B");
        hashMap.put("key3", "C");
        hashMap.put("key4", "D");
        hashMap.put("key5", "E");
        hashMap.put("key6", "F");
        
        Set keySet = hashMap.keySet();      
        Collection values = hashMap.values();   



        for (Map.Entry<String,String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key=" + key + ", Value=" + value);
        }
    




        }
 }