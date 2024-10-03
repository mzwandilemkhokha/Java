

class InitTest2{

	static int num1;
	int num2;

	{
		num2=100;
        System.out.println("This is an InitTest2 instance initializer block " + num2);
	}

	static{
        num1=200;
        System.out.println("This is a InitTest2 static initializer " + num1);
	}

	public InitTest2(){
		System.out.println("This is a InitTest2 no args constructor ");
	}


}