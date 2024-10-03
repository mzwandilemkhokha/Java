

class InitTest3 extends InitTest2{

	{
		num2++;

        System.out.println("This is an InitTest3 instance initializer block" + num2);
	}

	static{
        InitTest2.num1++;
        System.out.println("This is a InitTest3 static initializer " + InitTest2.num1);
	}

	public InitTest3(String a){
		super();
		System.out.println("This is a InitTest3 1 arg constructor " + a);
	}
    
    public InitTest3(String a, String b){
		this(a);
		System.out.println("This is a InitTest3 2 args constructor " + a + " " + b);
    }



}