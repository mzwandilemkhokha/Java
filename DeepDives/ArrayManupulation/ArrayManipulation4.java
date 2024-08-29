public class ArrayManipulation4 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};
       
       

        array[array.length - 1] = -1;
        array[array.length - 2] = -1;
        printArray("array before overwriting ",array);
        array=shrinkedArray(array);

        printArray("array after overwriting ",array);

    }

    public static int[] shrinkedArray(int[] array){
         int count = 0;
         int[]shrink;
            for (int i = 0;i < array.length;i++ ) {
                if(array[i]!=(-1)){
                       count++;
                        
                }

            }

            shrink=new int[count];

            for (int i = 0;i < array.length;i++ ) {
                if(array[i]!=(-1)){
                    shrink[i]=array[i];
                        
                }

            }


            return shrink;
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
