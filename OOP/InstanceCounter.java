public class InstanceCounter {
	
	static int counter;
	
	public InstanceCounter(){
		counter++;
		for (;counter<=4;counter++ ) {
		
		System.out.println("I am instance number:"+counter);
	
	}
}
public static void main(String[] args ){
	new InstanceCounter();
}
}
