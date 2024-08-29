public class ArrayManipulation5 {
    public static void main(String[]args){

        int[] array = {3,4,2,6,4,7,9,1};
       
        printArray("array before adding ",array);

        array = add(array,11);
        
        printArray("array after adding",array);


    }

    //TODO: This method throws an exception please fix it.
    public static int [] add(int[] arrayToAddTo, int itemToAdd){

        int initialSize = arrayToAddTo.length;
        int newSize = arrayToAddTo.length+1;
        int position=0;

        //Create an array that is equal to newSize
        //copy elements over

        int[] array2=new int[newSize];
        for(int i=0;i<arrayToAddTo.length;i++){
           array2[i]=arrayToAddTo[i];
           position++;

        }
          if(array2.length>arrayToAddTo.length){
            array2[position]=itemToAdd;
          }

           // if(array2[i-1]>arrayToAddTo[i]){
             //   array2[i-1]=itemToAdd;
            //}
        

        //add the element at the end of the array
        //Note this line is buggy as it uses the old array
        //Your code should use the new array
        //array2[newSize-2]=itemToAdd;

        //This should return the new array
        return array2;
    
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

