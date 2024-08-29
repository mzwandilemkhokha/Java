import java.util.*;
public class TestLinkedListClear{
	public static void main(String args[] ){
 LinkedList<String> names = new LinkedList<>();
        names.push("Thabo");
        names.push("Itu");
        names.push("Mzwandile");
        System.out.println(names);
        System.out.println("Clear method demonstration");
        names.clear();
        System.out.println(names);
	}

}