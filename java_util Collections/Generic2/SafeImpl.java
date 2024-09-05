 import java.util.*;

 public class SafeImpl <T>{
 	private ArrayList<T> arr= new ArrayList<T>();
void lockIn(T target){
	arr.add(target);
	
}

T getFromSafe(int key){
	return arr.get(key);
}
}
