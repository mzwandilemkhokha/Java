public class InitTest{

	static int num1;
	int num2;

	{
		num2=100;
        System.out.println("This is an instance initializer block");
	}

	static{
        num1=200;
        System.out.println("This is a static initializer");
	}

	public InitTest(){
		System.out.println("This is a no args constructor");
	}


	public static void main(String [] args){
          
          new InitTest();

		}


}