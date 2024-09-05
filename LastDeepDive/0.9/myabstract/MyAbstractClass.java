 public abstract class MyAbstractClass{
 	private String name;
	private int age;
	private String dob;




abstract static void doSomething();

public MyAbstractClass(String name, int age){
	this.name=name;
	this.age=age;
	System.out.println("Constructor "+"Name: "+name+" Age:"+age);
}
	public MyAbstractClass(String dob){
		System.out.println("this is Constructor2 "+dob);
	}

}
