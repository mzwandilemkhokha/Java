
import java.util.Scanner;
public class Challenge1Main{
 public static void main(String[] args){
 		Scanner scann= new Scanner(System.in);// Scanner objects to read what the user has typed in.		   
 		double distance_in_meters=0;// stroes distance to store in meters
 		int age=0;// stores the users age
 		String distance_from_store_prompt;// strore the distace from store  from user
 		String surname;//Stores the surname of user
 		String name; // stores the name of user
 		String date_of_birth;//stores the date of birth of user
 		String seconds_response;//stores the YES/NO response from user 
 		String milli_sec_response;//stores the YES/NO response from user
 		long age_in_milliseconds=0;//stores the age in milliseconds
 		int distance_from_store=0;//stores the value for the distance from store
 		boolean date_isValid=true;//checks if the date is valid
 		boolean number_is_valid=true;//checks if number is valind
 		String age_in_hex; //stroes te age in hex
 		String age_in_binary;//store the age in binary

 		name=Prompter.prompt("What is your first name: ");//Stores the name of the User
 
 		surname=Prompter.prompt("What is your surname: ");//Stores the surname of the user
 		


 		distance_from_store_prompt=Prompter.prompt("How far is your favourite store from your home(in KM)?");// Prompt and store user how far he is from the store
 		number_is_valid=NumberValidator.isValid(distance_from_store_prompt); //checks if response from user is a number
		
		if(number_is_valid==true){
				
				
 		        //distance_from_store=Integer.parseInt(distance_from_store_prompt);
 		        distance_in_meters=MilesCalculator.calculate(distance_from_store_prompt);
 		        distance_from_store=Integer.parseInt(distance_from_store_prompt);
		}
		else{
			while(number_is_valid!=true){
				distance_from_store_prompt=Prompter.prompt("Only numbers are allowed for capturing the distance, Please re-type distance ");
				number_is_valid=NumberValidator.isValid(distance_from_store_prompt);
				if(number_is_valid==true){
					distance_from_store=Integer.parseInt(distance_from_store_prompt);
					distance_in_meters=MilesCalculator.calculate(distance_from_store_prompt);
				}
			}
		}
	
 	

 		date_of_birth=Prompter.prompt("Enter your date of birth (DD/MM/YYYY): ");//the the users date of birth and check if it is valid
 		date_isValid=DateValidator.isValid(date_of_birth);
 				
				if(date_isValid==true){
					age=AgeValidator.calculate(date_of_birth);
					//date_isValid=false;
					}
					else{
						while(date_isValid!=true){
							date_of_birth=Prompter.prompt("Date of birth is in the wrong format, Re-type using DD/MM/YYYY format): ");//the the users date of birth and check if it is valid
 							date_isValid=DateValidator.isValid(date_of_birth);
 							if(date_isValid==true){
									age=AgeValidator.calculate(date_of_birth);
									//date_isValid=false;
					        }
						}
                    }

		
           
  	   

	//Challenge 1 Part 2 code starts here


	Printer.print("Hello "+ name+" " +surname);
	Printer.print("You are "+ age + " old");

	//Challenge 1 Part 2 code starts here
	//Print the distance in meters
	
	//distance_in_meters=MilesCalculator.milesMeterConvert(distance_from_store);
	Printer.print("The distance to nearest store is: "+distance_from_store+" KM");
	Printer.print("The distance to nearest store in miles: "+distance_in_meters+" miles");

	Printer.print("");
	seconds_response=Prompter.prompt("Do you want to know your age in seconds?"+"YES for Yes");//variable to store the "YES/NO response"
  	if(seconds_response.equals("YES")|| seconds_response.equals("Yes")|| seconds_response.equals("yes"))
    		{
        		
    			Printer.ageSeconds(age);
    		}
    		else{
    			
    		}

	Printer.print("");

	milli_sec_response=Prompter.prompt("Do you want to know your age in Milliseconds?"+"YES for Yes");//variable to store the "YES/NO response"
  	if(milli_sec_response.equals("YES")||milli_sec_response.equals("Yes")||milli_sec_response.equals("yes"))
    		{
        	
    			Printer.ageMilliseconds(age);
    		}
    		else{
    			
    }
    Printer.print("");

    //The code below displays the user age in hex
	Printer.print("=====================");
	age_in_hex=Integer.toHexString(age);
	Printer.print("Your age in hex is: "+Integer.toHexString(age));
	Printer.print("=====================");


		Printer.print("=====================");
	age_in_hex=Integer.toHexString(age);
	Printer.print("Your age in binary is: "+Integer.toBinaryString(age));
	Printer.print("=====================");
    }


}

