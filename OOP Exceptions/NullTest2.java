public class NullTest2 {

	static NullObject nullObject;
	
	public static void main(String[] args) {
		System.out.println("Start");
		try{
			new NullObject().test();
		}
	catch(NullPointerException e){
			System.out.println("NullPointerException occurred");
		}
		System.out.println("Finished");
	}

}
