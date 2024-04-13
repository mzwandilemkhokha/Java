import java.lang.*;
import java.util.Scanner;
public class DateValidator{
	
	public static boolean isValid(String dobPrompt){
		Scanner scann= new Scanner(System.in);
		System.out.println(dobPrompt);
		
		String date_of_birth =scann.nextLine();
		System.out.println(date_of_birth);

		//the if statement below chaecks whether the substring method functions accordingly
		boolean dateFormat=false;
		boolean loop_controller=true;
				/*
				if(date_of_birth.substring(3,4).equals("0")){
					System.out.println("zero detected on month");
					
					
				}else{
					System.out.println("right month");
					System.out.println(date_of_birth.substring(2,3));
				}
				if(date_of_birth.substring(0,1).equals("0")){
					System.out.println("zero detected day");
					
				}else{
					System.out.println("right day");
					System.out.println(date_of_birth.substring(0,1));
				}

						if(date_of_birth.substring(3,4).equals("0")){
							
							System.out.println("removed month"+date_of_birth.substring(3,4));
				}
				if(date_of_birth.substring(0,1).equals("0")){
							
							System.out.println("removed day"+date_of_birth.substring(0,1));
				}
		System.out.println(date_of_birth);
		*/	
		//(DD/MM/YYYY) The if statement checks if the length of the string is 10
		while(loop_controller){
		if(date_of_birth.length()==10 && (date_of_birth.length()>0))
		{
			//the if statement checks if the / is in the correct places in the string
			if(date_of_birth.charAt(2)=='/'&& date_of_birth.charAt(5)=='/')
			{
		
				int days= Integer.parseInt(date_of_birth.substring(0,2));
				int month=Integer.parseInt(date_of_birth.substring(3,4));
				int year= Integer.parseInt(date_of_birth.substring(6,9));
				if(((days<=31) &&( days>0)) && 
				   ((month>0) && (month<=12)) && ((year>0) && (year<=2024))){
				   	System.out.println("Date is in the correct format");
					loop_controller=false;
				}
					else{
					System.out.println("Date of birth is in the wrong format, Re-type using DD/MM/YYYY format");	
					loop_controller=false;
					date_of_birth =scann.nextLine();
					}
			}
		}

	



	
	else{

		System.out.println("Date of birth is in the wrong format, Re-type using DD/MM/YYYY format");
		date_of_birth =scann.nextLine();
		dateFormat=false;
		loop_controller=false;
	}
}
	return dateFormat;
}
}