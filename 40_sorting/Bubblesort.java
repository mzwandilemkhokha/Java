public class Bubblesort{
	public static void main(Strings[] args){
		int[] array1={1,5,3,9,6,10};

		for (int i=0;i<array1.length ;i++ ) {

			for (int j=0;j<array1.length-i-1 ;j++) {
 //tests if the next variable is greater than the variable that follows
                    if (array1[j] > array1[j + 1]) { 
                   
                    int tempVariable = arr[j]; //to temporarily store variable if its greater
                    arr[j] = arr[j + 1]; //swap
                    arr[j + 1] = temp; swap
                }
			}
			
		}
	}
}