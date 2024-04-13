public class ParamTest5 {
    public static void main(String[] args) {
       int num1=100;
       int num2=200;
        
        divideAndPrint(num1, num2);
    }
    
    public static void divideAndPrint(int num1, int num2) {
       int division=num2/num1;
        System.out.println(division);
    }
}