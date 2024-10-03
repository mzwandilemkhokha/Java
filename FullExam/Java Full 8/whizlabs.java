import java.util.*;
public class whizlabs{
	public static void main(String[] args){
	ArrayList<String> whizArray=new ArrayList<String>();
	whizArray.add("coke");
	whizArray.add("pepsi");
	whizArray.add("miranda");
	System.out.println("Total ArrayList::"+whizArray);
	String[] ws1=new String[1];
	String[] ws2= whizArray.toArray(ws1);
	System.out.println("ws1: "+(ws1==ws2));
System.out.println(Arrays.toString(ws1));
System.out.println(Arrays.toString(ws2));
}
}