import java.util.*;
public class ArrayChallenge361{
	public static void main(String[] args){

		Random rand=new Random(0);
		int[][][] three3Array= new int[10][10][3];

		for (int i=0;i<three3Array.length ;i++ ) {
			
			for (int ii=0;ii<three3Array[i].length ;ii++ ) {
				
				for (int iii=0;iii<3;iii++ ) {
					three3Array[i][ii][iii]=rand.nextInt(20);
				}
			}
			
		}
		//printing 3d
		System.out.println("3d Array");
		for (int i=0;i<three3Array.length ;i++ ) {
			
			for (int ii=0;ii<three3Array[i].length ;ii++ ) {
				
				for (int iii=0;iii<3;iii++ ) {
					System.out.print(three3Array[i][ii][iii]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

		int[][] twodArray=new int[10][10];

		for(int i=0;i<twodArray.length;i++){
			for(int ii=0; ii<twodArray[i].length;ii++){
				twodArray[i][ii]=rand.nextInt(30);
			}
		}

//printing contents
		System.out.println("2D Array");
		for(int i=0;i<twodArray.length;i++){
			for(int ii=0; ii<twodArray[i].length;ii++){
				System.out.print(twodArray[i][ii]+" ");
			}
			System.out.println();
		}
	}
}