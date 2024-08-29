import java.util.*;
public class CodeAlong2{
	public static void main(String[] args){
	Random rand=new Random();
	int[] number =new int[100];
	int[] destinationArray=new int[17];

	for (int i=0;i<number.length ;i++ ) {
		number[i]=rand.nextInt(50);
		System.out.print(number[i]+" ");
	}
	System.out.println();
	

    System.arraycopy(number,15, destinationArray, 0, destinationArray.length);
    for (int i=0;i<destinationArray.length ;i++ ) {
		
		System.out.print(destinationArray[i]+" ");
	}



	}
	
}