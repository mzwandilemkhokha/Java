import java.util.Scanner;

public class Prompter
{
	

public static String prompt(String prmpt)
{

System.out.println(prmpt);
Scanner reader= new Scanner(System.in);
String response=reader.nextLine();
return response;

}

}