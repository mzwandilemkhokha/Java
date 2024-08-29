import java.util.*;
public class String1{
    public static void main(String[] args){
        String line = "1,4,3,2,3,7,5,6,9"; 

        String[] splitter=line.split(",");
        int[] intArray=new int[splitter.length];
        for (int i=0;i<splitter.length ;i++ ) {
            intArray[i]=Integer.parseInt(splitter[i]);    
        }

System.out.println("Array Ascending order ");
printAscending(intArray);
System.out.println();
System.out.println("Array descending order ");
printDecending(intArray);

        
    }

    public static void printAscending(int[] array){
        int tempVariable;

        for (int i=0;i<array.length ;i++ ) {

            for (int j=0;j<array.length-i-1 ;j++) {
                if (array[j] > array[j + 1]) { 
                    tempVariable = array[j]; 
                    array[j] = array[j + 1]; 
                    array[j + 1] = tempVariable;
                }
            }
        }

        
        for (int i=0;i<array.length ;i++ ) {
                System.out.print(array[i]+" ");
        }
    }

    public static void printDecending(int[] array){
        int tempVariable;
        for (int i=0;i<array.length ;i++ ) {

            for (int j=0;j<array.length-i-1 ;j++) {
                if (array[j] < array[j + 1]) { 
                    tempVariable = array[j]; 
                    array[j] = array[j + 1]; 
                    array[j + 1] = tempVariable; 
                }
            }
        }
        for (int i=0;i<array.length ;i++ ) {
                System.out.print(array[i]+" ");
        }
    }
}
