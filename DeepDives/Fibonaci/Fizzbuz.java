public class Fizzbuz{
	public static void main(String[] args){
	int [] numbers=new int [100];

	for(int i=0;i<numbers.length;i++){
		numbers[i]=i+1;

		if((numbers[i]%3==0&&numbers[i]%5==0)){
			System.out.println("fizzbuzz");
		}
		else{
			if(numbers[i]%3==0){
				System.out.println("buzz");
			}
			else{
				if(numbers[i]%5==0){
				System.out.println("fizz");	
				}
				else{
					
						System.out.println(numbers[i]);	
					
				}
			}
		}
	}


	}
}