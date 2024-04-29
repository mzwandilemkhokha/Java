import java.util.Scanner;

public class Prompter
{
	
//Method receives a prompt as a parameter and returns what a user has typed to the main method

public static String prompt(String prmpt)
{

System.out.print(prmpt+": ");
Scanner reader= new Scanner(System.in);
String response=reader.nextLine();
return response;

}

}