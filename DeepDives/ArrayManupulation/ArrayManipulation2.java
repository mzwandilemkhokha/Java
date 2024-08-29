public class ArrayManipulation2 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};

        printArray("array before swapping ",array);
               
        int temp;
        int last=array.length-1;

        array=reverseArray(array);

      

        printArray("array after swapping ",array);

    }

    public static int[] reverseArray(int[] array){
        int[] revProcess= new int[array.length];
         int begin=array.length-1;
        for(int i=0;i<=array.length-1;i++){
            int temp=array[i];
            revProcess[begin]=temp;
           --begin;
        }
        return revProcess;
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
