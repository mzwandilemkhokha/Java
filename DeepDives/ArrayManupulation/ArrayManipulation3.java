public class ArrayManipulation3 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};
       
        
        printArray("array before swapping ",array);

        //sort the above array in ascendning order in-place. i.e. Using the same array
       array=sortedArray(array);


        printArray("array after swapping ",array);

    }

    public static int[] sortedArray(int[] array){
         int temp = 0;
            for (int i = 0;i < array.length;i++ ) {
                for (int j =i+1;j< array.length; j++) {
                    if(array[j]< array[i]){
                         temp = array[i];
                         array[i] = array[j];
                         array[j] = temp;
                    }
                }
            }
            return array;
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
