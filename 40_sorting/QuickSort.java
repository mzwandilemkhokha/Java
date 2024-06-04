public class QuickSort{
	public static void main(String[] args){
		int[] data = { 8, 7, 2, 1, 0, 9, 6 };
    System.out.println("Unsorted Array");
    for (int i=0;i<data.length ;i++ ) {
    	System.out.print(data[i]);
    	
    }

    int size = data.length;

    // call quicksort() on array data
    QuickSort.quickSort(data, 0, size - 1);
     System.out.println("Sorted Array");
    for (int i=0;i<data.length ;i++ ) {
    	System.out.print(data[i]);
    	
    }

 
	}
	public static int partition(int[] array,int low,int high){
		int pivot=array[high];

		int i=low -1;

		//loop and compare

		for(int j=low; j <high; j++){
			if(array[j]<=pivot){
				//if element smaller than pivot
				i++;

				//swapping
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
	}
	 // swapt the pivot element 
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    // return the position from where partition is done
    return (i + 1);

}

	public static void quickSort(int [] array, int low, int high){
		if(low<high){
			int pivot=partition(array, low, high);

			quickSort(array, low, pivot-1); //left ittems

			quickSort(array,pivot+1,high);// right of pivot


		}
	}
}
