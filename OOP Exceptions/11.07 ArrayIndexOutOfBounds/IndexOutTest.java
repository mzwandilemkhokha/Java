public class IndexOutTest {
	public static void main(String[] args) {
		int [] array = {444,55,666};
			int value;
		try{
		value = array[4];
		}
		catch(ArrayIndexOutOfBoundsException e){
System.out.println("The value is not within the scope f the array, Vvalue is assigned to 0");
		}
		finally{
			value=0;
System.out.println("Value = "+value);
		}
		
	}
}
