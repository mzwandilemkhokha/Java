public class ArrayBasics1{
	public static void main(String [] args){
		int[] myArray= {10,1,5,5,32,8,5,9,6,9,7,2,9,6,4,8,5,2,5,8,9,2,6,9,8,5,4,7,8,9,6,5,8,7,41,8,9,6,9,8,5,4,7,8,5,9,8,6,9,4};
		System.out.println("Array Length="+myArray.length);
		for (int i=0;i<myArray.length; i++ ) {
			myArray[i]+=1; //populating array
			System.out.print(myArray[i]+" ");

		}

		
	}
}