 import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        int[] numbersArray = new int[50];
Random rand=new Random();
        for(int i=0;i<numbersArray.length;i++){
            numbersArray[i]=rand.nextInt(20);
        }
       
       numbersArray[20]=numbersArray[20]+60;
       numbersArray[20]=numbersArray[21]+61;
		printArray(numbersArray);
       

    }

    public static void printArray(int[] array){
    	for(int i=0;i<array.length;i++){
           System.out.print(array[i]+" ");

        }
    }
 }
