 import java.util.*;
public class Sorting1 {
    public static void main(String[] args) {
        int[] numbersArray = new int[50];
        Random rand=new Random();
        for(int i=0;i<numbersArray.length;i++){
            numbersArray[i]=rand.nextInt(20);
        }
       
       numbersArray[20]=numbersArray[20]+60;
       numbersArray[20]=numbersArray[21]+61;
	   
       numbersArray=sortArray(numbersArray);
System.out.println("Sorted Array");
      for (int a=0;a<numbersArray.length ;a++ ) {
               System.out.print(numbersArray[a]+" ");
           }
           System.out.println();     

    }

    public static int[] sortArray(int[] array){
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
        
        return array;
    }
 }
