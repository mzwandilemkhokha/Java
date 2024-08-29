 public class ClassCastTest {
	public static void main(String[] args) {
		
		Object exception = new Object();
		
		System.out.println("Step 1");
		

		try{
		Exception exception2 = (Exception)exception;
		}
		catch(ClassCastException e){
			System.out.println("Casting failed");
		}
		finally{
		System.out.println("Step 2");	
		}
		
	}
}
