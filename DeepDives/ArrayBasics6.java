public class ArrayBasics6{
	public static void main(String [] args){
		
		
		int[][] numbers=new int[100][30];
		//System.out.println("Array Length="+myArray.length);
	
		//populating with numbers
	  for(int i = 0;i < numbers.length ;i++){
	  	 
         
            for(int j = 0;j < numbers[i].length ;j++){
            	numbers[i][j] = i * 2+3;
               
            }        	
        }

        	//printing the results
         for(int i = 0;i < numbers.length ;i++){
	  	 
         
            for(int j = 0;j < numbers[i].length ;j++){
            	numbers[i][j] = i * 2+3;
            	numbers[i][j]+=1;//addind one to the elements
            	if((numbers[i][j]%2==0)&&(numbers[i][j]%11==0)){
                System.out.println(numbers[i][j]+" ");
            }
            } 
                 	
        }
}
}