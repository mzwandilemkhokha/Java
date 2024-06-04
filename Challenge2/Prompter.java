import java.util.*;
public class Prompter{
	public static String prompt(String prompt){
		System.out.print(prompt+": ");
Scanner reader= new Scanner(System.in);
String response=reader.nextLine();
return response;

	}	

}