public class NumberFormatTest {
	public static void main(String[] args) {
		
		String number = "2345Q";
		
		System.out.println("Step 1");
		try{
		int converted = Integer.parseInt(number);
		}
		catch(NumberFormatException e){
			System.out.println("The number passed is not in the correct format");
		}
		System.out.println("Step 2");
	}
}
