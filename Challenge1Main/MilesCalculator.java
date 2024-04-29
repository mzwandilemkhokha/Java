import java.util.Scanner;
import java.text.DecimalFormat;

public class MilesCalculator{
	public static double calculate(String km_value)
	{
	
	DecimalFormat distance_formatter = new DecimalFormat("#,##"); 
	double distance_from_store=Double.parseDouble(km_value);

	double miles=distance_from_store/1.609;//formula from the internet that converts KMs to miles

	miles=Double.parseDouble(distance_formatter.format(miles));
	//time = Double.valueOf(df.format(time));
	
	//System.out.println(distance_from_store+" km in miles is equivalent to" +miles); //Prints the miles to the user used for testing for now
	return miles;
	}

	public static double milesMeterConvert(String milesParam){
		double km_to_miles=0;
		double meters=Double.parseDouble(milesParam);
		if((meters!= 0)&& (meters>0)){
		km_to_miles=meters*1609.344;
		
		}
		return km_to_miles;
	}
}