public class ArrayBasics2{
	public static void main(String [] args){
		int[] myArray= {10,1,5,5,32,8,5,9,6,9,7,2,9,6,4,8,5,2,5,8,9,2,6,9,8,5,4,7,8,9,6,5,8,7,41,8,9,6,9,8,5,4,7,8,5,9,8,6,9,4};
		System.out.println("Array Length= "+myArray.length);
		

			int i=0;
			while(i<myArray.length){
					myArray[i]+=1; //populating array
			

			if(myArray[i]%2==0&&(myArray[i]%11==0))
			{
				System.out.print(myArray[i]+" ");
			}

				i++;
			}


		}

		
	
}