public class ArrayManipulation8 {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {13,14,12,16,14,17,19,11,10};
       
        printArray("arrayA before merging ",arrayA);
       
        printArray("arrayA after merging ",arrayB);
        printArray("arrayA after merging ", merge( arrayA, arrayB));
    }

    public static int [] merge(int[] arrayA,int[] arrayB){
        //Write code that create a new array that is the size of the two arrays combined
        //copy both array into the new array contigously.

        int arraySize=arrayA.length+arrayB.length;
        int position=0;
        int[] newArray=new int[arraySize];

        for (int i=0;i<arrayA.length ;i++ ) {
            newArray[i]=arrayA[i];
            position++;
        }
        System.out.println(position);
        System.out.println(newArray.length);
         for (int i=0;i<arrayB.length;i++ ) {
            newArray[position]=arrayB[i];
        ++position;            
        }

        //Note this line is buggy as it returns arrayA
        //Your code should use the new array
        //This should return the new array
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
