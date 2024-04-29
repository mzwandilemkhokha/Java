import java.util.Scanner;

public class NumberValidator{
	public static boolean isValid(String num){
	Scanner scann = new Scanner(num);
boolean isNumber=false;
	if(scann.hasNextInt())
	{
		int x=scann.nextInt();
		
isNumber=true;

	}
	else{
		System.out.println("The number is not valid");
		isNumber=false;
	}
	


scann.close();
	return isNumber;		
}
}