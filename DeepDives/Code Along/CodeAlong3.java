import java.util.*;
public class CodeAlong3{
	public static void main(String[] args){
	
	getRow(3);
	
	}

	public static int[] getRow(int row){
		
		Random rand=new Random();
		int[][] number =new int[10][10];
		row-=1;

		for (int i=0;i<number.length ;i++ ) {
			for (int ii=0;ii<number[i].length ;ii++ ) {
			number[i][ii]=rand.nextInt(10);
			System.out.print(number[i][ii]+" ");
		}
		System.out.println();
	}

			System.out.println("The array on row "+(row+1)+" specified is as follows");
	   	int[] rowArray=new int[number[0].length];
	
	 	for (int i=0;i<number.length ; i++ ) {
			for(int ii=0;ii<number[i].length;ii++){
	
				if(i==row){
					System.out.print(number[i][ii]+" ");
				}
				else{

				}
		
		
	}
}
	
	return rowArray;
	
}


}