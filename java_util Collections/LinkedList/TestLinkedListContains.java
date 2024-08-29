import java.util.*;
public class TestLinkedListContains{
	public static void main(String args[] ){
 LinkedList<String> names = new LinkedList<>();
        names.push("Thabo");
        names.push("Itu");
        names.push("Mzwandile");
        System.out.println(names);
        System.out.println("Contains method demonstration: ");
        System.out.println("The list contaains Mzwandile: "+ names.contains("Mzwandile"));
        System.out.println("The list contaains Mzwa: "+ names.contains("Mzwa"));
        //System.out.println(names);
	}

}