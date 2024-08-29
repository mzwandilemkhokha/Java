import java.util.*;
public class String2{
    public static void main(String[] args){
       // String line = "1,4,3,2,3,7,5,6,9"; 
        String line = "1,4,3,2,3,7,5,6,9\n"+
                      "8,6,3,7,3,7,5,6,9\n";
                        

        String[] arraySpliter= line.split("\n");
        String[] array1={arraySpliter[0]};
        String[] array2={arraySpliter[1]};



String[][] multidimensionalArray= {array1,array2};

System.out.println(multidimensionalArray[0]);

String[] arrayElementsSplitter=multidimensionalArray[0][0].split(",");
String[] array2ElementsSplitter=multidimensionalArray[1][0].split(",");
 String[][] multidimensionalArray2= {arrayElementsSplitter,array2ElementsSplitter};

int[][] intArray=new int[arrayElementsSplitter.length][array2ElementsSplitter.length];
int indexer=0;

    for (int i=0;i<multidimensionalArray2.length ;i++ ) {

        for (int ii=0;ii<multidimensionalArray2[i].length ;ii++ ) {
            intArray[i][ii]=Integer.parseInt(multidimensionalArray2[i][ii]);
            System.out.print(multidimensionalArray2[1][0]+" ");
      }    
      System.out.println();
    }

    System.out.println("Array Ascending order ");
    printAscending(intArray);
    System.out.println();
    System.out.println("Array descending order ");
    printDescending(intArray);

        
    }
    /*
    the method sorts the array items in ascending order and returns the sorted array
    */


    public static int[] sortDescending(int[] array){
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
        
        return array;
    }

    /*
    the method sorts the array items in ascending order and returns the sorted array
    */
     public static int[] sortAscending(int[] array){
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


    /*
    This method receives an array as a parameter and then uses the method soreDescending
    to sort the the array items in descending order
    the first index represents the row of a multi dimensional array and the second one represents the column. The program then uses a for loop 
    to print the content of the array
    */
     public static void printDescending(int[][] array){
       int[] array1Sort=sortDescending(array[0]);
       int[] array2Sort=sortDescending(array[1]);

       int [][]sortedArray={array1Sort,array2Sort};

       for(int i=0; i<sortedArray.length;i++){
        for (int ii=0;ii<sortedArray[i].length ;ii++ ) {
            System.out.print(sortedArray[i][ii]+" ");
            
        }
        System.out.println();
       }

       
    }


    /*
    This method receives an array as a parameter and then uses the method soreDescending
    to sort the the array items in Ascending order
    the first index represents the row of a multi dimensional array and the second one represents the column. The program then uses a for loop 
    to print the content of the array
    */
    public static void printAscending(int[][] array){
       int[] array1Sort=sortAscending(array[0]);
       int[] array2Sort=sortAscending(array[1]);

       int [][]sortedArray={array1Sort,array2Sort};

       for(int i=0; i<sortedArray.length;i++){
        for (int ii=0;ii<sortedArray[i].length ;ii++ ) {
            System.out.print(sortedArray[i][ii]+" ");
            
        }
        System.out.println();
       }

    
    }
    
}