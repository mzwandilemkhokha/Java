import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1Or {
   public static void main(String[] args) {
       List<Integer> numbers1 =
               new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
      
      
       Predicate<Integer> isEven= num -> num%2==0;

       Predicate<Integer> isNotEven= num -> num>0;

       Predicate<Integer> combined=isNotEven.or(isEven);

       for(int num: numbers1){
        if(combined.test(num)){
        System.out.println(num);}
       }
   }
}
