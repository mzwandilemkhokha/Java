public class Computer{

	public static void main(String[] args){
		obj1.regularMethod();
		obj1.defaultMethod();
	}
	static MyInterface obj1= new MyInterface(){
		public void regularMethod(){
			System.out.println("()regular nethod in anonymous");
		}

		public void defaultMethod(){
			System.out.println("overriden default nethod in anonymous");
		}
	};

	
}

interface MyInterface{
	void regularMethod();

default void defaultMethod(){
	System.out.println("Defalut defaultMethos");
}

default void anotherDefaultMethod(){
	System.out.println("overr Defalut intreface anotherdefaultMethos");
}

}

