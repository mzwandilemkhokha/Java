public class Main{
	public static void main(String[] args){
		MyInterface obj1=new MyInnerClass();
		obj1.regularMethod();
		obj1.anotherDefaultMethod();
	}
	private static class MyInnerClass implements MyInterface{
		public void regularMethod(){
		System.out.println("Default: Interface defaultMethod");
	}
	public void anotherDefaultMethod(){
		System.out.println("Overridden implementation of defaultMethod in anonymous class");
	}

	}


}

interface MyInterface{
	void regularMethod();

	default void defaultMethod(){
	System.out.println("Default: Interface defaultMethod");
	}

	default void anotherDefaultMethod(){
	System.out.println("Default: Interface another defaultMethod");
	}
}

