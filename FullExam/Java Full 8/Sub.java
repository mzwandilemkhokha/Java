class Sub extends Base{
	
	public static void main(String [] args){
if(args[0].equals("open")){
	if(args[1].equals("someone"))
		System.out.println("hello!");
	else System.out.println("Go away");
}
	}
	public void methodA(){
	System.out.println("sub-MethodA");
	}
	public void methodB(){
	System.out.println("sub-MethodB");
	}
}
class Base{
	void methodA(){
	System.out.println("base-MethodA");
	}
	
}

