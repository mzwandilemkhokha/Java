import java.util.*;
public class CodeAlong4{
	public static void main(String[] args){
	
	getRow(3);
	System.out.println();
	getColumn(5);
	System.out.println();
	getCell(5,5);
	
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

public static int[] getColumn(int column){
		
		Random rand=new Random();
		int[][] number =new int[10][10];
		

		for (int i=0;i<number.length ;i++ ) {
			for (int ii=0;ii<number[i].length ;ii++ ) {
			number[i][ii]=rand.nextInt(10);
			System.out.print(number[i][ii]+" ");
		}
		System.out.println();
	}

			System.out.println("The array on column "+(column+1)+" specified is as follows");
	   	int[] rowArray=new int[number[1].length];
	
	 	for (int i=0;i<number.length ; i++ ) {
			for(int ii=0;ii<number[i].length;ii++){
	
				if(ii==column){
					System.out.print(number[i][ii]+" ");
				}
				else{

				}
		
		
	}
}
	
	return rowArray;
	
}

public static void getCell(int column,int row){
		
		Random rand=new Random();
		int[][] number =new int[10][10];
		

		for (int i=0;i<number.length ;i++ ) {
			for (int ii=0;ii<number[i].length ;ii++ ) {
			number[i][ii]=rand.nextInt(10);
			System.out.print(number[i][ii]+" ");
		}
		System.out.println();
	}

	for (int i=0;i<number.length ; i++ ) {
			for(int ii=0;ii<number[i].length;ii++){
	
				if(ii==column&&i==row){
					System.out.println("The array on value stored in the cell "+column+","+row+" is: "+number[row-1][column-1]);
				}
				else{

				}
		
		
	}
}

			System.out.println("The array on value stored in the cell "+column+","+row+" is: "+number[row][column]);
			//System.out.println("The array on value stored in the cell "+column+","+row+" is: "+number[0][0]);
	   	


 }

}