public class EquivalanceTest4 {
	public static void main(String[] args) {
		
		 String a = new String("a");
		String b = new String("b");
		
		boolean result = a.equals(b);
		
		System.out.println("Result1 = "+result);
		
		a.concat("heelo");

		result = a.equals(b);
		
		System.out.println("Result1 after concat = "+result);
boolean result2 = a.hashCode()==b.hashCode();
System.out.println(result2);
		
	}
}
