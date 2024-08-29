import java.util.function.Supplier;
import java.util.function.IntSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
public class SSupplier{
    public static void main(String[] args) {
     
        Supplier<String> stringSupplier = () -> "I am a supplier";
        
      
        System.out.println(stringSupplier.get());
    
//Int Supplier
         Supplier<Integer> intSupplier = () -> 100;
        
      
        System.out.println(intSupplier.get());

        //IntSupplier
          IntSupplier inPrimitiveSupplier = () -> 47;
           System.out.println(inPrimitiveSupplier.getAsInt());


//consumer
            Consumer<String> stringConsumer = s -> System.out.println(s);
        
       
        stringConsumer.accept("I am a consumer");


 //int consumer
         IntConsumer integerConsumer = s -> System.out.println(s);
        
       
        integerConsumer.accept(35);

        //int primitive consumer
          IntConsumer intPrimitiveConsumer= s -> System.out.println(s);
        
       
        intPrimitiveConsumer.accept(94);

          // Creating predicate 
        Predicate<String> stringColorTester = s -> s.equals("blue");

         boolean result = stringColorTester.test("brown");//tesr


System.out.println("The result of the comparison is :"+ result);
       
    }


}
