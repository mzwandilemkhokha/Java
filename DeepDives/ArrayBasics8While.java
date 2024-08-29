public class ArrayBasics8While{
	public static void main(String [] args){
		
		
		int[][] numbers=new int[100][30];
		//System.out.println("Array Length="+myArray.length);
	
		//populating with numbers

        int i=0;
        while(i<numbers.length){
        	int j=0;
        	while(j<numbers[i].length)
        	{
        		numbers[i][j] = i * 3;

        		j++;
        	}
        	i++;

        }

        //printing the results
        int i2=0;
        while(i2<numbers.length){
        	int j2=0;
        	while(j2<numbers[i2].length)
        	{
        			numbers[i2][j2]+=1;//addind one to the elements
            if(numbers[i2][j2]%2!=0&&numbers[i2][j2]%8==0)
                System.out.println(numbers[i2][j2]+" ");

        		j2++;
        	}
        		i2++;
        }

        
}
}