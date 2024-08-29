public class ArrayPopulation1 {
    public static void main(String[]args){
        int[] array = new int[10];
        char[] charArray=new char[10];
        long[]  longArray=new long[10];
        float[] floatArray=new float[10];
        double[] doubleArray=new double[10];
        byte[] byteArray=new byte[10];
        short[] shortArray=new short[10];

        array[3]=1;
        charArray[2]=9;
        longArray[4]=10;
        floatArray[6]=(float)7.0f;
        doubleArray[9]=3;
        byteArray[1]=(byte)50;
        shortArray[3]=(short)25;


        printArray("array: ",array);
        printCharArray("chararray: ",charArray);
         printLongArray("Longarray: ",longArray);
          printFloatArray("Floatarray: ",floatArray);
           printDoubleArray("Double array: ",doubleArray);
            printByteArray("byte array: ",byteArray);
            printShortArray("shortArray", shortArray);


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

    public static void printCharArray(String prefix,char[] arrayToPrint){
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

    public static void printDoubleArray(String prefix,double[] arrayToPrint){
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

    public static void printFloatArray(String prefix,float[] arrayToPrint){
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

    public static void printLongArray(String prefix,long[] arrayToPrint){
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

    public static void printShortArray(String prefix,short[] arrayToPrint){
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
      public static void printByteArray(String prefix,byte[] arrayToPrint){
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
