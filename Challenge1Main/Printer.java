public class Printer{
	public static void print(String printString){
		System.out.println(printString);
	}

	//extra methods not in the flow diagram

	//the method below receives age as a parameter and 
	public static void ageMilliseconds(int ageParam){
    //The time in milliseconds is equal to the time in years multiplied by 31,556,952,000. source: on the following line 
	//https://www.inchcalculator.com/convert/year-to-millisecond/#:~:text=The%20time%20in%20milliseconds%20is,in%20years%20multiplied%20by%2031%2C556%2C952%2C000.
    long age_in_milliseconds=(long)ageParam * 31556952000l;

    System.out.println("Your age in milliseconds: "+age_in_milliseconds);
    
	}

	public static void ageSeconds(int ageParam){
		//31,536,000 seconds in a year

		long age_in_Seconds=(long)ageParam * 31556952000l;

    System.out.println("Your age in Seconds is: "+age_in_Seconds+ " seconds");
	}
}