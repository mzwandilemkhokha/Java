public class MockExam2 {
	public static void main(String[] args){

		//declarations
    	int [] shoeSize  =  {11,2,33,4,5,6,7,8,9,10,2,4,6,8,20,1,3,5,10,99,17,2,3,21,5,6,7,8,9,50,13,2,4,32,7,8,4,2,6,8,2,5,43,9,3,5,88,54,4,10};
        int j = 0;
        int n = 0;
        int t = 0;
        int s = 0;
        int k = 0;
        int y = 0;


        //start of loopp
        while(n < shoeSize.length){
            System.out.print(shoeSize[n] +" ");
            n++;
            System.out.print(" ");
        }

    	//end of loop
    	

        //start of loopp
        while(j < shoeSize.length){

    	 	int shirt = shoeSize[j];
    	 	int pants = shoeSize[j]%2;

    	 	switch(pants){
    	 		case 0:
    	 			System.out.println(shirt);
    	 			break;
    	 	}
    	 	 j++;
    	}	

        //start of loopp    
    	while(t < shoeSize.length){

    	    int sock = shoeSize[t];
    	 	int shoe = shoeSize[t]%11;

            switch(shoe){
                case 0:
                    System.out.println(sock);
                    break;
                    }
                t++;
            }
            
        //start of loopp
        while(s < shoeSize.length){
            System.out.print(shoeSize[s] +1);
            s++;
            System.out.print(" ");
        }

         //start of loopp   
        while(k < shoeSize.length){

            int me = shoeSize[k] + 1;
            int you = me%2;

            switch(you){
                case 0:
                     System.out.println(me);
                     break;
                }
                k++;
            }
            
        //start of loopp    
        while(y < shoeSize.length){ 

            int us = shoeSize[y] + 1;
            int we = us%11;

            switch(we){
                case 0:
                    System.out.println(us);
                    break;
                }
              y++;
            }
    }       
}
