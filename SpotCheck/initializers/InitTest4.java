
class InitTest4 extends InitTest3{

	

	{
		num2++;
        System.out.println("This is an InitTest4 instance initializer block " + num2);
	}

	static{
        InitTest2.num1++;
        System.out.println("This is a InitTest4 static initializer " +   InitTest2.num1);
	}

	public InitTest4( String a, String b, String c){
		super(a,b);
		System.out.println("This is a 3 args InitTest4 constructor " + a + " " + b + " " + c );
	}


}