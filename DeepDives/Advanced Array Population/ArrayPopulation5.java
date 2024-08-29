public class ArrayPopulation5 {
    public static void main(String[]args){
        int[] array = new int[10];
        char[] charArray=new char[10];
        long[]  longArray=new long[10];
        float[] floatArray=new float[10];
        double[] doubleArray=new double[10];
        byte[] byteArray=new byte[10];
        short[] shortArray=new short[10];
        boolean[] booleanArray=new boolean[10];

        


        printArray("array: ",array);
        printCharArray("chararray: ",charArray);
        printLongArray("Longarray: ",longArray);
        printFloatArray("Floatarray: ",floatArray);
        printDoubleArray("Double array: ",doubleArray);
        printByteArray("byte array: ",byteArray);
        printShortArray("shortArray", shortArray);
        printBooleanArray("BooleanArray", booleanArray);



    }
    
  public static void printBooleanArray(String prefix,boolean[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            if(i<5)
                arrayToPrint[i]=false;
            else
            arrayToPrint[i]=true;
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }

            
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            if(i<5)
                arrayToPrint[i]=0;
            else
            arrayToPrint[i]=i;
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
             if(i<5)
                arrayToPrint[i]=0;
            else
            arrayToPrint[i]=(char)(i+90);
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
    
        for (int i =5;i < arrayToPrint.length;i++) {
            if(i<5)
                arrayToPrint[i]=0;
            else
            arrayToPrint[i]=i;
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
              if(i<5)
                arrayToPrint[i]=0;
            else
            arrayToPrint[i]=i;
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
              if(i<5)
                arrayToPrint[i]=0;
            else
            arrayToPrint[i]=i;
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
             if(i<5)
                arrayToPrint[i]=(short)0;
            else
            arrayToPrint[i]=(short)i;

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
              if(i<5)
                arrayToPrint[i]=(byte)0;
            else
            arrayToPrint[i]=(byte)i;

            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }

            
        }
        System.out.print("]\n");
    }

}
