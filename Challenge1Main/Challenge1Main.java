
import java.util.Scanner;
public class Challenge1Main{
 public static void main(String[] args){
 //Prompter prmt= new Prompter();
 

 String name=Prompter.prompt("What is your first name: ");
 String surname=Prompter.prompt("What is your surname");

 boolean date_of_birth=DateValidator.isValid("Enter your date of birth (DD/MM/YYYY):");

 double distance_from_store=MilesCalculator.calculate("How far is your favourite store from your home?");
 }
}