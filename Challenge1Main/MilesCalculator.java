import java.util.Scanner;
public class MilesCalculator{
	public static double calculate(String prmpt)
	{
	Scanner scann= new Scanner(System.in);
	System.out.println(prmpt);
double distance_from_store=Double.parseDouble(scann.nextLine());
double miles=distance_from_store/1.609;
System.out.println(distance_from_store+"km in miles is equivalent to" +miles);
	return miles;
	}
}