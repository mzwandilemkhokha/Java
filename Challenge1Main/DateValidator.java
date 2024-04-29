import java.lang.*;
import java.util.Scanner;
public class DateValidator{

	/*
	 *The isValid() method has a string parameter which has the prompt that asks a user to punch in date of birth
	 *The method reads the date of birth from user and uses a while loop to ensure that a user has entered the correct date
	 *When the wrong date is entered the user will be prompted till he/she enters the right date 
	 *The method has the return object type of String which return a string that has the date in*/
	public static boolean isValid(String dob_value){
		
		int days,month,year;
		String dob=dob_value;
		
		//System.out.println(date_of_birth);

		//the if statement below chaecks whether the substring method functions accordingly
		boolean dateFormat=false;
		boolean loop_controller=true;
			
		
		//(DD/MM/YYYY) The if statement checks if the length of the string is 10
		
		if(dob.length()==10 && (dob.length()>0))
		{
			
			//the if statement checks if the / is in the correct places in the string
			if(dob.charAt(2)=='/'&& dob_value.charAt(5)=='/')
			{
					//DD/MM/YYYY
				days= Integer.parseInt(dob.substring(0,2));
				month=Integer.parseInt(dob.substring(3,5));
				year= Integer.parseInt(dob.substring(6,10));
				if(((days<=31) &&( days>0)) && 
				   ((month>0) && (month<=12)) && ((year>1910) && (year<=2024))){
				   	System.out.println("Date is in the correct format");
				   	
					dateFormat=true;
				}
					else{
					System.out.println("Date of birth is in the wrong format");
					
					dateFormat=false;
					
					}
			}
		}
	
	else{

		System.out.println("Date of birth is in the wrong format");
		dateFormat=false;
		
	    }
      
	return dateFormat;
   
   }
  

}