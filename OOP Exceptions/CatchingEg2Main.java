public class CatchingEg2Main {
	public static void main(String[] args) {
		CatchingEg2 myObject = new CatchingEg2();

		try{
		myObject.doSomething();
		}
		catch(Exception e){
	e.printStackTrace();

		}
		System.out.println("Finished");
	}
}
