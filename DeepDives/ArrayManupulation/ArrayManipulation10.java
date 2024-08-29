public class ArrayManipulation9 {
    public static void main(String[]args){
     int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {3,14,12,6,14,7,19,11,0};


        int[] noDuplicates=sub( arrayA, arrayB);
        int marker=0;
        int arrayLegnth=arrayB.length+noDuplicates.length;
        int[] newArray=new int[arrayB.length+noDuplicates.length];
       
      System.arraycopy(arrayA, 0, newArray, 0, arrayA.length);
      System.arraycopy(noDuplicates,0,newArray,arrayA.length,noDuplicates.length);

        newArray=sortAscending(newArray);
        printArray("arrayA before subtracting ",arrayA);       
        printArray("arrayB before subtracting ",arrayB);

       // arrayA = sub( arrayA, arrayB);
        printArray("Array after subtracting ",sub( arrayA, arrayB));       
       // printArray("arrayB after subtracting ",arrayB);
        printArray("Array after subtracting ",newArray);  
        
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


    public static int[] sub(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size a - duplicates
        //copy non-duplicates into the new array contigously.

        int duplicateCount=0;
  
 
        for (int i=0;i<arrayA.length ;i++ ) {
            for (int j=0;j<arrayB.length ;j++ ) {
                if(arrayA[i]==arrayB[j]){
                    duplicateCount++;
                    }
            }
        }

        int[] newArray= new int[arrayB.length-duplicateCount];

        int indexer=0;

           
        for (int i=0;i<arrayA.length ;i++ ) {
            for (int j=0;j<arrayB.length ;j++ ) {
                if(arrayB[i]!=arrayA[i])
                {
                    newArray[indexer]=arrayB[i];
                    indexer++;
                        //System.out.println(arrayB[i]);
                    break;
                    }
                }
            }
           

    
        return newArray;
    }
   
      public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }

            
        }
        System.out.print("]\n");
    }

    
   

}
