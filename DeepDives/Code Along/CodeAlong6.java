import java.util.*;
public class CodeAlong6{
	public static void main(String[] args){
	
	Scanner scanner=new Scanner(System.in);

	
int option;
int rowRetrieve;
int columnRetrieve;
int rowCell;
int columnCell;
boolean controller=true;
printMenu();
option=scanner.nextInt();




while(controller){
switch(option){
case 1:
	System.out.println("Enter row you want to retrieve");
	rowRetrieve=scanner.nextInt();
	getRow(rowRetrieve);
	printMenu();
option=scanner.nextInt();
	break;
case 2:
	System.out.println("Enter column you want to retrieve");
	columnRetrieve=scanner.nextInt();
	getColumn(columnRetrieve);
	System.out.println();
	printMenu();
option=scanner.nextInt();
	break;
case 3:
	System.out.println("Enter column");
	columnCell=scanner.nextInt();
	System.out.println("Enter row");
	rowCell=scanner.nextInt();
	getCell(rowCell,columnCell);
	System.out.println();
	printMenu();
option=scanner.nextInt();
	break;
case 99:
	controller=false;
	System.out.println("Exiting..........");
	break;
default:
	System.out.println("Wrong Seletion");
	System.out.println();
	printMenu();
	option=scanner.nextInt();
	break;
		}
}

	//getRow(3);
	//System.out.println();
	//getColumn(5);
	//System.out.println();
	//getCell(5,5);
	
	}

public static void printMenu(){
System.out.println("Welcome, Select any of the options");
System.out.println("1.Retrieve row");
System.out.println("2.Retrieve column");
System.out.println("3.Retrive cell");
System.out.println("99.Exit");

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
System.out.println();
	
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
System.out.println();
	
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