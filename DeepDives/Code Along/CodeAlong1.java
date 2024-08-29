public class CodeAlong1{
	public static void main(String[] args){
int [][] numbers=new int[10][10];

for (int i=0;i<numbers.length ;i++ ) {
	for (int j=0;j<numbers[i].length ;j++ ) {
		numbers[i][j]=i;
	}
}

count(numbers);
	}
	public static void count(int[][] max){
		for (int i=0;i<max.length ;i++ ) {
			for (int j=0;j<max[i].length ;j++ ) {
				System.out.print(max[i][j]+" ");
			}
			System.out.println();
		}
	}
}