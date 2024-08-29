import java.util.*;
public class TestLinkedListPop{
	public static void main(String args[] ){
 LinkedList<String> names = new LinkedList<>();
        names.push("Thabo");
        names.push("Itu");
        names.push("Mzwandile");
        System.out.println(names);
        System.out.println("Pop demonstration");
        names.pop();
        System.out.println(names);
	}

}