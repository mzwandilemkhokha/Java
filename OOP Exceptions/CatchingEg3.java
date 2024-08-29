public class CatchingEg3 {
	public void doSomething() throws MzwandileException {
		int i = 42;
		
		if(i > 30){
			throw new MzwandileException("An error occurred");
		}
		System.out.println("Doing something...");
	}
}
