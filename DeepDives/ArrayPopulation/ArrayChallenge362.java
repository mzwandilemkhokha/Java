public class ArrayChallenge362{
	public static void main(String [] args){
	int[] even = new int[100];
	int[] odd = new int[100];
	int[] prime = new int[100];

		even[0]=2;
		odd[0]=1;
		prime[0]=2;
	
	for(int i=1;i<even.length;i++){
		if(i==0)
			even[i]=2;
		else 
			even[i-1]=i*2;
	}

	for(int i=0;i<odd.length;i++){
			if(i==0)
				odd[i]=1;
			else 
			{
				if(odd[i-1]%2!=0)
					odd[i]=i;

			}

	}

	for (int i=0;prime.length>i ;i++ ) {
			prime[i]=i;
	}






	System.out.println();
	System.out.println("Even numbers");
	for(int i=0;i<even.length;i++){
		System.out.print(even[i]+" ");
	}
	System.out.println();
	System.out.println("Odd Numbres ");
	for(int i=0;i<even.length;i++){
		System.out.print(odd[i]+ " ");
	}
	System.out.println();
	System.out.println("Prime numbers");
	for (int i=0;prime.length>i ;i++ ) {
		System.out.print(prime[i]+ " ");
	}


	}
}