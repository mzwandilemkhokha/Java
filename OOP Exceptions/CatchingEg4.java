public class CatchingEg3 {
	public void doSomething() throws MkhokhaException {
		int i = 42;
		
		if(i > 30){
			throw new MkhokhaException("An error occurred");
		}
		System.out.println("Doing something...");
	}
}
