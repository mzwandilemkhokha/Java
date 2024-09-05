public class MyClass{
	public static void main(String[] args){

		Interface1 interface1= new Interface1(){
		
			public void doSomething(){
				System.out.println("Overridden method of a Functional Interface!! ");

			
			}
			public void staticInter(){
				System.out.println("Static inter");

			
			}

		
		};
			Interface1 interface2= new Interface1(){
		
			public void 	staticInter(){
				System.out.println("Static inter");

			
			}
		};

	
			interface1.doSomething();
			interface1.staticInter();

	}


}