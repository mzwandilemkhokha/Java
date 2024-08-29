public class ArrayBasics4{
	public static void main(String [] args){
		
		
int[] numbers=new int[50];
		System.out.println("Array Length="+myArray.length);
		for (int i=0;i<myArray.length; i++ ) {
					
			if(i==0){
				numbers[i]=1;
	}
	else{
		numbers[i]=numbers[i-1]+2;

		if((numbers[i]%11==0))
			{
				System.out.print(numbers[i]+" ");
			}
		
	}
			

		}

		
	}
}