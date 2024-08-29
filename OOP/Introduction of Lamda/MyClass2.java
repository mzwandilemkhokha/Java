public class MyClass2  {
   public static void main (String[] args) {
      MyInterface2 myInterface2 = () -> {
        
          return "implementation complete";
      };
      System.out.println(myInterface2.testingLambda());
   }
}
