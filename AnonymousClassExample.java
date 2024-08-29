interface MyInterface{
	void method();
}
public class AnonymousClassExample{
	private int x=10;

	void method(){
	MyInterface myInterface=new MyInterface(){
	public void method(){
	System.out.println(x);
	}
	};
	myInterface.method();
	}

	public static void main(String[] args){
	AnonymousClassExample example = new AnonymousClassExample();
	example.method();

	MyInterface anotherInterface=example.new MyInterface(){
	public void method(){
	System.out.println("Anonymous clss");
	}
	};
	anotherInterface.method();
	}
}


