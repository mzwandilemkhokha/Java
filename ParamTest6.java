public class ParamTest6 {
    public static void main(String[] args) {
       int num1=100;
       int num2=250;
       int num3=200;
        
       int bigNum= bigNum(num1, num2, num3);
       System.out.println(bigNum);
    }
    
    public static int bigNum(int num1, int num2, int num3) {
       int big=0;
       if(num1<num2)
         if(num3<num2)
         {
         big=num2;
         }
         else{
               if(num3>num2)
               {
                  big=num3;
               }
         }
      else{
big=num1;
      }
        return big; 
    }
}